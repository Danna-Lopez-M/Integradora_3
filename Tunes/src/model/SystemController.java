package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class SystemController {
	
	private ArrayList<User> users;
	private ArrayList<Audio> audios;
	private ArrayList <Store> songsSells;
	
	public SystemController() {
		this.users = new ArrayList<User>();
		this.audios = new ArrayList<Audio>();
		this.songsSells = new ArrayList<Store>();
	}
	
	/**Description: It allows to register an Artist
     * post: a new Artist is save
     * @param name String The name of the Artist
     * @param id String The number of identification of the user
     * @param date LocalDate The date of register
     * @param url String The URL to the image that represents to the artist
     * @return boolean to show if the artist was register or not
     */
	public boolean registerUserArtist(String name, String id, LocalDate date, String url) {
		return users.add(new Artist(name, id, date, url));
	}
	
	/**Description: The method show all Artists that are register
	 * post: Show the name of the user of if don't exist any user of that type
	 * @return msg String The list of names of the users or a caveat
	 */
	public String showUserArtist() {
		String msg = "";
		
		for (int i= 0; i<users.size(); i++) {
			if(users.get(i) instanceof Artist) {
				msg += (i+1) + ". " + ((Artist)users.get(i)).getName();
			}
			else {
				msg = "There is not Artist users register yet";
			}
		}
		
		return msg;
	}
	
	/**Description: It allows to register a Content Creator
     * post: a new Content Creator is save
     * @param name String The name of the Content Creator
     * @param id String The number of identification of the user
     * @param date LocalDate The date of register
     * @param url String The URL to the image that represents to the Content Creator
     * @return boolean To show if the content creator was register or not
     */
	public boolean registerUserCCreator(String name, String id, LocalDate date, String url) {
		return users.add(new ContentCreator(name, id, date, url));
	}
	
	/**Description: The method show all Content Creators that are register
	 * post: Show the name of the user of if don't exist any user of that type
	 * @return msg String The list of names of the users or a caveat
	 */
	public String showUserCCreator() {
		String msg = "";
		
		for (int i= 0; i<users.size(); i++) {
			if(users.get(i) instanceof ContentCreator) {
				msg += (i+1) + ". " + ((ContentCreator)users.get(i)).getName();
			}
			else {
				msg = "There is not Content Creator users register yet";
			}
		}
		
		return msg;
	}
	
	/**Description: It allows to register a Standard user
     * post: a new Standard user is save
     * @param name String The name of the Standard user
     * @param id String The number of identification of the user
     * @param date LocalDate The date of register
     * @return boolean To show if the standard user was register or not
     */
	public boolean registerUserStandard(String name, String id, LocalDate date) {
		return users.add(new Standard(name, id, date));
	}
	
	/**Description: The method show all Standard users that are register
	 * post: Show the name of the user of if don't exist any user of that type
	 * @return msg String The list of names of the users or a caveat
	 */
	public String showUserStandard() {
		String msg = "";
		
		for (int i= 0; i<users.size(); i++) {
			if(users.get(i) instanceof Standard) {
				msg += (i+1) + ". " + ((Standard)users.get(i)).getName();
			}
			else {
				msg = "There is not Standard users register yet";
			}
		}
		
		return msg;
	}
	
	/**Description: It allows to register a Premium user
     * post: a new Premium user is save
     * @param name String The name of the Premium user
     * @param id String The number of identification of the user
     * @param date LocalDate The date of register
     * @return boolean To show if the premium user was register or not
     */
	public boolean registerUserPremium(String name, String id, LocalDate date) {
		return users.add(new Premium(name, id, date));
	}
	
	/**Description: The method show all Premium users that are register
	 * post: Show the name of the user of if don't exist any user of that type
	 * @return msg String The list of names of the users or a caveat
	 */
	public String showUserPremium() {
		String msg = "";
		
		for (int i= 0; i<users.size(); i++) {
			if(users.get(i) instanceof Premium) {
				msg += (i+1) + ". " + ((Premium)users.get(i)).getName();
			}
			else {
				msg = "There is not Artist users register yet";
			}
		}
		
		return msg;
	}
	
	/**Description: The method show all Consumer users that are register
	 * post: Show the name of the user of if don't exist any user of that type
	 * @return msg String The list of names of the users or a caveat
	 */
	public String showUserConsumer() {
		String msg = "";
		
		for (int i=0; i<users.size(); i++) {
			if (users.get(i) instanceof Consumer) {
				msg += (i+1) + ". " + ((Consumer)users.get(i)).getName();
			}
			else {
				msg = "There is not a Producer user";
			}
		}
		
		return msg;
	}
	
	/**Description: It allows to register a Podcast
     * post: a new Podcast is save
     * @param int nameCC the number of position of the Content Creator that owns the podcast
     * @param name String The name of the podcast
     * @param url String The URL to the representative image of the podcast
     * @param duration double The time of duration of the podcast in seconds
     * @param category The position of the category of the podcast
     * @return boolean To show if the podcast was register or not
     */
	public boolean addPodcast(int nameCC, String name, String url, double duration, String description, int category) {
		boolean control = false;
		String nameContC = users.get(nameCC).getName();
		
		Podcast audioA = new Podcast(name, url, duration, description, category, nameContC);
		audios.add(audioA);
		
		if (users.get(nameCC) instanceof ContentCreator) {
			control = ((ContentCreator)users.get(nameCC)).addPodcast(audioA);
		}
		
		return control;
	}
	
	/**Description: The method show all the Podcasts that are register
	 * post: Show the name of the podcast or if don't exist any podcast yet
	 * @return msg String The list of the name of the podcasts or a caveat
	 */
	public String showPodcast() {
		String msg = "";
		
		for (int i=0; i<audios.size(); i++) {
			if (audios.get(i) instanceof Podcast) {
				Podcast pod = ((Podcast)audios.get(i));
				msg += (i+1) + pod.getName() + pod.getCategory() + "\n" ;
			}
		}
		
		return msg;
	}
	
	/**Description: The method show all possibilities of category that have a podcast
	 * post: Show all the Categories
	 * @return msg String The list of the categories
	 */
	public String showTypePodcast() {
        String msg = "";
        for (int i=0; i<Category.values().length; i++){
           msg += "\n" + (i+1) + ". " + Category.values()[i];
        }

        return msg;
    }
	
	/**Description: It allows to register a Song
     * post: a new Song is save
     * @param nameART int the number of position of the Artist that owns the song
     * @param name String The name of the song
     * @param url String The URL to the representative image of the song
     * @param duration double The time of duration of the song in seconds
     * @param album String The album to belongs the song
     * @param genre int The position of the genre of the song
     * @param price double The cost of a song when you buy it
     * @return boolean To show if the song was register or not
     */
	public boolean addSong(int nameART, String name, String url, double duration, String album, int genre, double price) {
		boolean control = false;
		String nameArtist = users.get(nameART).getName();
		
		Song audioA = new Song(name, url, duration, album, genre, price, nameArtist);
		
		audios.add(audioA);
		
		if (users.get(nameART) instanceof Artist) {
			control = ((Artist)users.get(nameART)).addSong(audioA);
		}
		
		return control;
	}
	
	/**Description: The method show all the Songs that are register
	 * post: Show the name of the songs or if don't exist any song yet
	 * @return msg String The list of the name of the songs or a caveat
	 */
	public String showSong() {
		String msg = "";
		
		for (int i=0; i<audios.size(); i++) {
			if (audios.get(i) instanceof Song) {
				Song sg = ((Song)audios.get(i));
				msg += (i+1) + sg.getName() + sg.getAlbum() + "\n" ;
			}
		}
		
		return msg;
	}
	
	/**Description: The method show all possibilities of genre that have a song
	 * post: Show all the Genres
	 * @return msg String The list of the genres
	 */
	public String showTypeSong() {
        String msg = "";
        for (int i=0; i<Genre.values().length; i++){
           msg += "\n" + (i+1) + ". " + Genre.values()[i];
        }

        return msg;
    }
	
	/**Description: The method show all the audio register
	 * post: Show all the audio
	 * @return msg String The list of the audios
	 */
	public String showAudio() {
		String msg = "";
		
		for (int i=0; i<audios.size(); i++) {
			msg += (i+1) + audios.get(i).getName() + "\n";
		}
		
		return msg;
	}
	
	/**Description: It allows to register a Playlist in a User
     * post: a new Playlist is save
     * @param user int The number of position of the user that owns the playlist
     * @param name String The name of the playlist
     * @return cond boolean To show if the playlist was register or not
     */
	public boolean createdPlaylist(int user, String name) {
		boolean cond = false;
		
		if (users.get(user) instanceof Consumer) {
			if (users.get(user) instanceof Standard) {
				((Standard)users.get(user)).createdPlayList(name);
				cond = true;
			}
			else if (users.get(user) instanceof Premium) {
				((Premium)users.get(user)).createdPlayList(name);
				cond = true;
			}
		}
		
		return cond;
	}
	
	/**Description: The method show all the playlist of a specific user
	 * post: Show the name of the playlists or if don't exist any playlist yet
	 * @return msg String The list of the name of the playlist or a caveat
	 */
	public String showPlaylist(int name) {
		String msg = "";
		
		if (users.get(name) instanceof Consumer) {
			if(users.get(name) instanceof Standard) {
				msg = ((Standard)users.get(name)).showPlaylist();

			}
			else if(users.get(name) instanceof Premium) {
				msg = ((Premium)users.get(name)).showPlaylist();
			}
		}
			
		return msg;
	}
	
	/**Description: It allows to add an audio of a playlist of an user
     * post: an audio is added
     * @param nameUser int The number of position of the user that owns the playlist
     * @param namePlaylist int The number of position of the playlist in the user
     * @param audio int The number of position of the audio to add in the system
     * @return control boolean To show if the audio was add to the playlist or not
     */
	public boolean addAudioPlaylist(int nameUser, int namePlaylist, int audio) {
		boolean control = false;
		
		Audio aud = audios.get(audio);
		
		if (users.get(nameUser) instanceof Consumer) {
			if (users.get(nameUser) instanceof Standard) {
				control = ((Standard)users.get(nameUser)).addAudioPlaylist(namePlaylist, aud);
			}
			else if (users.get(nameUser) instanceof Premium) {
				control = ((Premium)users.get(nameUser)).addAudioPlaylist(namePlaylist, aud);
			}
		}
		return control;
	}
	
	/**Description: It allows to remove an audio of a playlist of an user
     * post: an audio is remove
     * @param nameUser int The number of position of the user that owns the playlist
     * @param namePlaylist int The number of position of the playlist in the user
     * @param audio int The number of position of the audio to remove in the system
     * @return control boolean To show if the audio was remove of the playlist or not
     */
	public boolean removeAudioPlaylist(int nameUser, int namePlaylist, int audio) {
		boolean control = false;
		
		Audio aud = audios.get(audio);
		
		if (users.get(nameUser) instanceof Consumer) {
			if (users.get(nameUser) instanceof Standard) {
				control = ((Standard)users.get(nameUser)).removeAudioPlaylist(namePlaylist, aud);
			}
			else if (users.get(nameUser) instanceof Premium) {
				control = ((Premium)users.get(nameUser)).removeAudioPlaylist(namePlaylist, aud);
			}
		}
		
		return control;
	}
	
	/**Description: It allows to share a playlist of an user
     * post: It's generate the code of the playlist and show it with the matrix
     * @param nameUser int The number of position of the user that owns the playlist
     * @param namePlaylist int The number of position of the playlist in the user
     * @return msg String Show the matrix and the code of the playlist if was possible share it
     */
	public String sharePlaylist(int nameUser, int namePlaylist) {
		String msg = "";
		
		if (users.get(nameUser) instanceof Consumer) {
			if (users.get(nameUser) instanceof Standard) {
				Standard user = (Standard) users.get(nameUser);
				PlayList posPlay = user.getPlaylists()[namePlaylist];
				int songs = posPlay.getAmountS();
				int podcasts = posPlay.getAmountP();
				
				if(songs>0 && podcasts==0) {
					msg = posPlay.showMatrixPlaylist(posPlay.getMatrixCode()) + codeN(posPlay);
					posPlay.setCode(codeN(posPlay));
				}
				else if (songs==0 && podcasts>0) {
					msg = posPlay.showMatrixPlaylist(posPlay.getMatrixCode()) + codeT(posPlay);
					posPlay.setCode(codeT(posPlay));
				}
				else if (songs>0 && podcasts>0) {
					msg = posPlay.showMatrixPlaylist(posPlay.getMatrixCode()) + codeOdd(posPlay);
					posPlay.setCode(codeOdd(posPlay));
				}
				else if (songs==0 && podcasts==0) {
					msg = "The playlist " + posPlay.getName() + " don't have any song or podcast. It's not possible share it";
				}
			}
			else if (users.get(nameUser) instanceof Premium) {
				Premium user = (Premium) users.get(nameUser);
				PlayList posPlay = user.getPlaylists().get(namePlaylist);
				int songs = posPlay.getAmountS();
				int podcasts = posPlay.getAmountP();
				
				if(songs>0 && podcasts==0) {
					msg = posPlay.showMatrixPlaylist(posPlay.getMatrixCode()) + codeN(posPlay);
					posPlay.setCode(codeN(posPlay));
				}
				else if (songs==0 && podcasts>0) {
					msg = posPlay.showMatrixPlaylist(posPlay.getMatrixCode()) + codeT(posPlay);
					posPlay.setCode(codeT(posPlay));
				}
				else if (songs>0 && podcasts>0) {
					msg = posPlay.showMatrixPlaylist(posPlay.getMatrixCode()) + codeOdd(posPlay);
					posPlay.setCode(codeOdd(posPlay));
				}
				else if (songs==0 && podcasts==0) {
					msg = "The playlist " + posPlay.getName() + " don't have any song or podcast. It's not possible share it";
				}
			}
		}
		else if (users.get(nameUser) instanceof Producer) {
			msg = "The user selected isn't a Consumer user";
		}
		
		return msg;
	}
	
	/**Description: It allows to generate the code of a playlist of songs
     * post: It's generate the code of the playlist
     * @param playlist PlayList The playlist to generate the code with the matrix
     * @return code int Show the code of the playlist
     */
	public int codeN(PlayList playlist) {
		int[][] matrix = playlist.getMatrixCode();
		String msg = "", subcode1 = "", subcode2 = "", subcode3 = "";
		int code = 0;
		
		for (int i=0; i<matrix.length; i++) {
			subcode1 += "" + matrix[matrix.length-(i+1)][0];
			
			if (i>0 && i<matrix.length-1) {
				subcode2 += "" + matrix[i][i];			
			}
			
			subcode3 += "" + matrix[matrix.length-(i+1)][matrix.length-1];
		}
		
		msg = subcode1 + subcode2 + subcode3;
		code = Integer.parseInt(msg);
		
		return code;
	}
	
	/**Description: It allows to generate the code of a playlist of podcast
     * post: It's generate the code of the playlist
     * @param playlist PlayList The playlist to generate the code with the matrix
     * @return code int Show the code of the playlist
     */
	public int codeT(PlayList playlist) {
		int[][] matrix = playlist.getMatrixCode();
		String msg = "", subcode1 = "", subcode2 = "", subcode3 = "";
		int code = 0;
		
		for (int i=0; i<matrix.length; i++) {
			subcode1 = "" + matrix[0][i];
			
			if(i != 0) {
				subcode2 = "" + matrix[i][2];
			}
			if (i != matrix.length-1) {
				subcode3 = "" + matrix[i][3];
			}
		}
		
		msg = subcode1.substring(0,4) + subcode2 + subcode3 + subcode1.substring(4,7);
		code = Integer.parseInt(msg);
		
		return code;
	}
	
	/**Description: It allows to generate the code of a playlist of songs and podcast
     * post: It's generate the code of the playlist
     * @param playlist PlayList The playlist to generate the code with the matrix
     * @return code int Show the code of the playlist
     */
	public int codeOdd(PlayList playlist) {
		int[][] matrix = playlist.getMatrixCode();
		String msg = "";
		int code = 0;
		
		for (int i=matrix.length-1; i>0; i--) {
			for (int j=matrix.length-1; j>0; j--) {
				if ((i+j)>1) {
					if((i+j)%2 != 0) {
						msg += "" + matrix[i][j];
					}
				}
			}
		}
		
		code = Integer.parseInt(msg);
		
		return code;
	}
	
	/**Description: It allows to reproduced an audio
	 * pre: The user and the audio exist
     * post: It's reproduced an audio
     * @param nameUser int The number of position of the user that going to reproduced the audio
     * @param nameAudio int The number of position of the audio in the system
     * @return msg String Show the simulation of the reproduction or an ad
     */
	public String reproducedAudio(int nameUser, int nameAudio) {
		String msg = "";
		
		if(users.get(nameUser) instanceof Consumer) {
			if (users.get(nameUser) instanceof Standard) {
				Standard userTemp = (Standard) users.get(nameUser);
				
				if (audios.get(nameAudio) instanceof Song) {
					Song song = (Song) audios.get(nameAudio);
					
					msg = song.reproduce() + song.getName();
					song.changeNumReprod();
					userTemp.addChangeReprodSongs(song);
					
					if ((userTemp.getPlayedSongs())%2 == 0) {
						msg += showAd();
					}
					
				}
				else if(audios.get(nameAudio) instanceof Podcast) {
					Podcast pod = (Podcast) audios.get(nameAudio);
					
					msg = pod.reproduce() + pod.getName();
					pod.changeNumReprod();
					userTemp.addChangeReprodPodcasts(pod);
					
					if((userTemp.getPlayedPodcasts())%2 == 0) {
						msg += showAd();
					}
				}
			}
			else if (users.get(nameUser) instanceof Premium) {
				Premium userTemp = (Premium) users.get(nameUser);
				
				if (audios.get(nameAudio) instanceof Song) {
					Song song = (Song) audios.get(nameAudio);
					
					msg = song.reproduce() + song.getName();
					song.changeNumReprod();
					userTemp.addChangeReprodSongs(song);
				}
				else if(audios.get(nameAudio) instanceof Podcast) {
					Podcast pod = (Podcast) audios.get(nameAudio);
					
					msg = pod.reproduce() + pod.getName();
					pod.changeNumReprod();
					userTemp.addChangeReprodPodcasts(pod);
				}
			}
		}
		
		return msg;
	}
	
	/**Description: It allows to reproduced an audio
     * post: It's show an advertisement
     * @return msg String Show an advertisement randomly
     */
	public String showAd() {
        String msg = "";
        Random rd = new Random();
        int ad = rd.nextInt(3);
        
        if (ad==0) {
        	msg = Publicity.COCACOLA.reproduce();
        }
        else if (ad==1) {
        	msg = Publicity.MYM.reproduce();
        }
        else if (ad==2) {
        	msg = Publicity.NIKE.reproduce();
        }
        
        return msg;
    }
	
	/**Description: It allows to buy a song
	 * pre: the user and song have to exist
     * post: A song is buy
     * @param user int The number of position of the user that buy the song
     * @param song int The number of position of the song to buy in the system
     * @return msg String Show if the audio was bought or not
     */
	public String buySong(int user, int song) {
		String msg = "";
		Song songAdd = (Song) audios.get(song);
		
		if(users.get(user) instanceof Standard) {
			if (audios.get(song)!=null &&  audios.get(song) instanceof Song) {
				Standard userTemp = (Standard) users.get(user);
				
				if (userTemp.addBuyedSong(songAdd)) {
					songsSells.add(new Store(songAdd));
					userTemp.changeSongsBuy();
					
					msg = songAdd.sell() + " to the user " + userTemp.getName();
				}
				else {
					msg = "It was not possible to buy the song";
				}
			}
			else if (!(audios.get(song) instanceof Song)) {
				msg = "The audio selected is not a song";
			}
		}
		else if (users.get(user) instanceof Premium) {
			if (audios.get(song)!=null &&  audios.get(song) instanceof Song) {
				Premium userTemp = (Premium) users.get(user);
				
				if (userTemp.addBuyedSong(songAdd)) {
					songsSells.add(new Store(songAdd));
					userTemp.changeSongsBuy();
					
					msg = songAdd.sell() + " to the user " + userTemp.getName();
				}
				else {
					msg = "It was not possible to buy the song";
				}
			}
			else if (!(audios.get(song) instanceof Song)) {
				msg = "The audio selected is not a song";
			}
		}
		
		return msg;
	}
	
	/**Description: It allows to show the total of reproductions of all the songs and podcasts
     * post: Show the reproductions of both type of audio
     * @return msg String Show the total number of reproductions of song and podcasts
     */
	public String totalReprod() {
		String msg = "", song = "", pod = "";
		int sumS=0, sumP=0;
		
		for (int i=0; i<audios.size(); i++) {
			if (audios.get(i) instanceof Song) {
				Song s = (Song) audios.get(i);
				sumS += s.getNumReprod();
			}
			if (audios.get(i) instanceof Podcast) {
				Podcast p = (Podcast) audios.get(i);
				sumP += p.getNumReprod();
			}
		}
		song = "Songs views of the entire platform: " + sumS ;
		pod = "Podcasts views of the entire platform: " + sumP;

		msg = song + pod;
		
		return msg;
	}
	
	public String mostListenGenreUser(int user) {
		String msg = "";
		
		if (users.get(user) instanceof Consumer) {
			if (users.get(user) instanceof Standard) {
				Standard userTemp = (Standard) users.get(user);
				
				for (int i=0; i<Genre.values().length; i++) {
					
				}
			}
		}
		
		return msg;
	}
}
