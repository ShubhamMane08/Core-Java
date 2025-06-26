package Inheritance;

public class GoogleDrive extends Google {
	
	int photos;
	int videos;
	int docs;
	int audio;
	int bin;
	
	public GoogleDrive()
	{
		
	}
	public GoogleDrive(String ceo, String hq, String email, String pass, int photos,int videos, int docs, int audio,int bin)
	{
		this.ceo=ceo;
		this.hq=hq;
		this.email=email;
		this.pass=pass;
		
		this.photos=photos;
		this.videos=videos;
		this.docs=docs;
		this.audio=audio;
		this.bin=bin;
		
	}
	
	public void add(String fileType)
	{
		switch(fileType)
		{
		case "Photos":
		case "photos":
		{
			System.out.println("Photo added!");
			photos++;
		}break;
		case "Video":
		case "video":
		case "videos":
		{
			System.out.println("Video addded!");
			videos++;
			
		}
		break;
		case "Audio":
		case "audio":
		{
			System.out.println("Adudio added!");
			audio++;
		}
		break;
		
		case "docs":
		case "Docs":
		{
			System.out.println("Document added!");
			docs++;
		}
		break;
		default:
			System.out.println("Invalid file type");
		}
	}
	
	public void delete(String fileType)
	{
		switch(fileType)
		{
			case "Photos":
			case "photos":
			{
				System.out.println("photo deleted!");
				photos--;
				bin++;
			}
			break;
			case "Videos":
			case "video":
			{
				System.out.println("Videos Deleted!");
				videos--;
				bin++;
				
			}
			break;
			case "Audios":
			case "audios":
			{
				System.out.println("Audio Deleted!");
				audio--;
				bin++;
			}
			break;
			case "docs":
			case "Docs":
			{
				System.out.println("Document Deleted.! ");
				docs--;
				bin++;
			}
			break;
			default:
			{
				System.out.println("Invalid file type");
			}
		}
		
	}
	
	public void displayGoogleDrive()
	{
		System.out.println("Photos : "+photos);
		System.out.println("Videos : "+videos);
		System.out.println("Docs : "+docs);
		System.out.println("Bin : "+bin);
		
		
	}

}
