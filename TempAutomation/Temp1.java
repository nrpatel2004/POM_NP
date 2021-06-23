public class Temp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("This is my first test on pro");
		/* WebDriver myD;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nrpat\\OneDrive\\Desktop\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
		myD = new ChromeDriver();
		myD.manage().window().maximize();
		myD.navigate().to("https://www.google.com/");
		firstmethod();
		for (int i = 0;i<4;i++) {
		 System.out.println(mysecondmethod(i));	
		}  
		mythirdmethod(); */
		
		treebuild();

	}
	
	public static void myfirstmethod() {
		
		System.out.println("This is my first method for Array ");
		
		String family [] = {"Deddy","Mum","Joya","Dada","Ba"};
		
		for (int i=0;i < 4;i++) {
			System.out.println("In my family i have:-" + family[i]);
		}
		
		System.out.println("");
	
	}
	
	public static String mysecondmethod(int i) {
		
		if (i==0) {
			System.out.println("This is my Second method with Array and return method ");
		}

		String family [] = {"Deddy","Mum","Joya","Dada","Ba"};
		
    	String member =	("In my family i have:-" + family[i]);
		
		return member;
		
	}
	
	public static void mythirdmethod() {
		
		System.out.println("This is my third method with double Array ");
		
		String familytree[][] = {{"Daddy","Joya"},{"mom","Joya"},{"Dada","Joya"},{"Ba","Joya"}};
		
		for (int i=0;i<4;i++) {
			
			System.out.println("In my family i have :" + familytree [i][0]);
			
		}
		
	}
	
	public static void treebuild() {
		
		for (int i = 0; i < 14; i++) {
			if (i<10) {
			   for (int j = 0; j < 10 - i; j++)
			    System.out.print(" ");
			   for (int k = 0; k < (2 * i + 1); k++)
			    System.out.print("*");
			   System.out.println();
			  }
			else
			{
				for (int x =0;x<10;x++)
				{
					System.out.print(" ");
				}
				System.out.print("*");
				 System.out.println();
				
			}
		}	
			for (int a=0;a<10;a++) {
				for (int b=0;b<10-a;b++)
					System.out.print(" ");
				for (int c=0;c<(2*a+1);c++)
					System.out.print("*");
				     System.out.println();
				 }
		}
		
	}

