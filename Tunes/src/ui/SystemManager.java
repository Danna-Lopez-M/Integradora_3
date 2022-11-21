package ui;

import model.SystemController;
import java.time.LocalDate;
import java.util.Scanner;

public class SystemManager {
	
	private Scanner sc;
	private SystemController controller;
	
	public SystemManager() {
		this.sc = new Scanner (System.in);
		this.controller = new SystemController();
	}
	
	public static void main(String[] args) {
		SystemManager manager = new SystemManager();
		manager.menu();
	}
	
	public void menu() {
		System.out.println("Welcome to NeoTunes");
		boolean exit = false;
		
		while(!exit) {
			System.out.println("What would you like to do?\n1. Register Artist users"
					+ "\n2. Register Content Creator users" + "\n3. Register Standard users"
					+ "\n4. Register Premium users" + "\n5. Register a Song"
					+ "\n6. Register a Podcast" + "\n7. Created a playlist"
					+ "\n8. Edit a playlist" + "\n9. Share a playlist"
					+ "\n10. Reproduce a audio" + "\n11. Buy a song"
					+ "\n12. Show the total reproductions of all the songs and podcasts"
					+ "\n13. Show the most listen show to an User");
			int option = sc.nextInt();
			
			switch(option) {
				case 0:
					exit = true;
					break;
				case 1:
					registerUserArtist();
					break;
				case 2:
					registerUserCCreator();
					break;
				case 3:
					registerUserStandard();
					break;
				case 4:
					registerUserPremium();
					break;
				case 5:
					registerSong();
					break;
				case 6:
					registerPodcast();
					break;
				case 7:
					createdPlaylist();
					break;
				case 8:
					editPlayList();
					break;
				case 9:
					sharePlaylist();
					break;
				case 10:
					reproduceAudio();
					break;
				case 11:
					buySong();
					break;
				case 12:
					System.out.println(controller.totalReprod());
					break;
				case 13:
					
					break;
				default:
					
			}
		}
	}
	
	/**Description: It allows to register the users of the type Artist
     * @return void
     */
	public void registerUserArtist() {
		System.out.println("Type the name of the user");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.println("Type the id");
		String id = sc.nextLine();
		
		LocalDate date = LocalDate.now();
		
		System.out.println("Type the url of your perfil photo");
		String url = sc.nextLine();
		
		if (controller.registerUserArtist(name, id, date, url)) {
			System.out.println("User register successfully");
		}
		else {
			System.out.println("It was not possible register the user\n");
		}
	}
	
	/**Description: It allows to register the users of the type Content Creator
     * @return void
     */
	public void registerUserCCreator() {
		sc.nextLine();
		System.out.println("Type the name of the user");
		String name = sc.nextLine();
		
		System.out.println("Type the id");
		String id = sc.nextLine();
		
		LocalDate date = LocalDate.now();
		
		System.out.println("Type the url of your perfil photo");
		String url = sc.nextLine();
		
		if (controller.registerUserCCreator(name, id, date, url)) {
			System.out.println("User register successfully");
		}
		else {
			System.out.println("It was not possible register the user\n");
		}
	}
	
	/**Description: It allows to register the users of the type Standard
     * @return void
     */
	public void registerUserStandard() {
		sc.nextLine();
		System.out.println("Type the name of the user");
		String name = sc.nextLine();
		
		System.out.println("Type the id");
		String id = sc.nextLine();
		
		LocalDate date = LocalDate.now();
		
		if(controller.registerUserStandard(name, id, date)) {
			System.out.println("User register successfully");
		}
		else {
			System.out.println("It was not possible register the user\n");
		}
	}
	
	/**Description: It allows to register the users of the type Premium
     * @return void
     */
	public void registerUserPremium() {
		sc.nextLine();
		System.out.println("Type the name of the user");
		String name = sc.nextLine();
		
		System.out.println("Type the id");
		String id = sc.nextLine();
		
		LocalDate date = LocalDate.now();
		
		if (controller.registerUserPremium(name, id, date)) {
			System.out.println("User register successfully");
		}
		else {
			System.out.println("It was not possible register the user\n");
		}
	}
	
	/**Description: It allows to register the audio of the type Song
     * @return void
     */
	public void registerSong() {
		
		System.out.println("Selected the artist owner");
		System.out.println(controller.showUserArtist());
		int nameUser = sc.nextInt();
		
		System.out.println("Type the name of the song");
		String name = sc.nextLine();

		System.out.println("Type the url of the respresentative image of the song");
		String url = sc.nextLine();
		
		System.out.println("Type the amount of seconds of duration of the song");
		double duration = sc.nextDouble();
		
		System.out.println("Type the album to which the song belongs");
		String album = sc.nextLine();
		
		System.out.println("Type the genre of the song");
		System.out.println(controller.showTypeSong());
		int genre = sc.nextInt();
		
		System.out.println("Type the price of the song");
		double price = sc.nextDouble();
		
		if (controller.addSong((nameUser-1), name, url, duration, album, (genre-1), price)) {
			System.out.println("The song has been register successfully");
		}
		else {
			System.out.println("It was not possible to register the song");
		}
	}
	
	/**Description: It allows to register the audio of the type Podcast
     * @return void
     */
	public void registerPodcast() {
				
		System.out.println("Selected the content creator owner");
		System.out.println(controller.showUserCCreator());
		int nameUser = sc.nextInt();
		
		System.out.println("Type the name of the podcast");
		String name = sc.nextLine();

		System.out.println("Type the url of the respresentative image of the podcast");
		String url = sc.nextLine();
		
		System.out.println("Type the amount of seconds of duration of the podcast");
		double duration = sc.nextDouble();
		
		System.out.println("Type a short description of the podcast");
		String description = sc.nextLine();
		
		System.out.println("Type the category of the podcast");
		System.out.println(controller.showTypePodcast());
		int category = sc.nextInt();
		
		if (controller.addPodcast((nameUser-1), name, url, duration, description, (category-1))) {
			System.out.println("The podcast has been register successfully");
		}
		else {
			System.out.println("It was not possible to register the podcast");
		}
	}
	
	/**Description: It allows to register a playlist of one user
     * @return void
     */
	public void createdPlaylist() {
		System.out.println("Type the user that you want to created a playlist");
		System.out.println(controller.showUserConsumer());
		int user = sc.nextInt();
		
		System.out.println("Enter the name of the playlist");
		String name = sc.nextLine();
		
		if (controller.createdPlaylist(user, name)) {
			System.out.println("The playlis was created");
		}
		else {
			System.out.println("It was not possible created the playlist");
		}
		
	}
	
	/**Description: It allows to change the attributes of one playlist of one user
     * @return void
     */
	public void editPlayList() {
		
		System.out.println("Do you want to edit the playlist of a Premium user or a Standard user?\n1. Standard\n2. Premium");
		int tUser = sc.nextInt();
		
		System.out.println("Do you want add or deleted a audio?\n1. Add\n2. Deleted \n3. Go back menu");
		int addOrdel = sc.nextInt();
			
		if (tUser==1) {
			System.out.println("Type the user that you want to edit a playlist");
			System.out.println(controller.showUserStandard());
			int nameUser = sc.nextInt();
			
			if(!controller.showPlaylist(nameUser-1).equals("")) {
				System.out.println("Type the name of the playlist");
				System.out.println(controller.showPlaylist(nameUser-1));
				int namePlaylist = sc.nextInt();
				
				if (addOrdel == 1) {
					System.out.println("Type the audio that you want to add");
					System.out.println(controller.showAudio());
					int audio = sc.nextInt();
					
					if (controller.addAudioPlaylist((nameUser-1),(namePlaylist-1),(audio-1))) {
						System.out.println("The audio was added to the playlist successfully");
					}
					else {
						System.out.println("It was not possible added the audio to the playlist");
					}
				}
				else if (addOrdel == 2) {
					System.out.println("Type the audio that you want to deleted");
					System.out.println(controller.showAudio());
					int audio = sc.nextInt();
					
					if (controller.addAudioPlaylist((nameUser-1),(namePlaylist-1),(audio-1))) {
						System.out.println("The audio was deleted to the playlist successfully");
					}
					else {
						System.out.println("It was not possible deleted the audio to the playlist");
					}
				}
				else if (addOrdel == 3) {
					System.out.println("Going back to the menu");
					menu();
				}
			} 
			else {
				System.out.println("The user don't have any playlist created yet");
				menu();
			}
			
		}
	
		else if (tUser==2) {
			System.out.println("Type the user that you want to edit a playlist");
			System.out.println(controller.showUserPremium());
			int nameUser = sc.nextInt();
			
			if (!controller.showPlaylist(nameUser-1).equals("")) {
			
				System.out.println("Type the name of the playlist");
				System.out.println(controller.showPlaylist(nameUser-1));
				int namePlaylist = sc.nextInt();
				
				if (addOrdel == 1) {
					System.out.println("Type the audio that you want to add");
					System.out.println(controller.showAudio());
					int audio = sc.nextInt();
					
					if (controller.addAudioPlaylist((nameUser-1),(namePlaylist-1),(audio-1))) {
						System.out.println("The audio was added to the playlist successfully");
					}
					else {
						System.out.println("It was not possible added the audio to the playlist");
					}
					
				}
				else if (addOrdel == 2) {
					System.out.println("Type the audio that you want to deleted");
					System.out.println(controller.showAudio());
					int audio = sc.nextInt();
					
					if (controller.addAudioPlaylist((nameUser-1),(namePlaylist-1),(audio-1))) {
						System.out.println("The audio was deleted to the playlist successfully");
					}
					else {
						System.out.println("It was not possible deleted the audio to the playlist");
					}
				}
				else if (addOrdel == 3) {
					System.out.println("Going back to the menu");
					menu();
				}
			}

			else {
				System.out.println("The user don't have any playlist created yet");
				menu();
			}	
		}
	}
	
	/**Description: It allows to share one playlist of one user
     * @return void
     */
	public void sharePlaylist() {
		int namePlaylist = 0;
		
		System.out.println("Select the user that you want to share the playlist");
		System.out.println(controller.showUserConsumer());
		int user = sc.nextInt();
		
		System.out.println("Select the playlist that you want to share");
		System.out.println(controller.showPlaylist(user));
		
		if(controller.showPlaylist(user) != "The user don't have any playlist created yet"){
			namePlaylist = sc.nextInt();
		}
		
		System.out.println(controller.sharePlaylist((user-1), (namePlaylist-1)));
	}
	
	/**Description: It allows that one user reproduce one audio
     * @return void
     */
	public void reproduceAudio() {
		
		System.out.println("Select the user that you want to reproduce the audio");
		System.out.println(controller.showUserConsumer());
		int user = sc.nextInt();
		
		System.out.println("Select the audio that you want to share");
		System.out.println(controller.showAudio());
		int audio = sc.nextInt();
		
		System.out.println(controller.reproducedAudio((user-1), (audio-1)));
	}
	
	/**Description: It allows that one user buy a song
     * @return void
     */
	public void buySong() {
		System.out.println("Select the user that want to buy the song");
		System.out.println(controller.showUserConsumer());
		int user = sc.nextInt();
		
		System.out.println("Select the song that you want to buy");
		System.out.println(controller.showSong());
		int song = sc.nextInt();
		
		System.out.println(controller.buySong((user-1), (song-1)));

	}
	
	
}
