/*Bookshop Management System project source code*/

import java.util.Objects;
import java.util.Scanner;

class staff
{
	void new_staff()
    {
        String[] sname={"P.K.Laksarani", "M.K.Sakunika", "Y.N.Rajapaksha", "N.Rathnayaka","K.J.T.Naveen"}; 
		String[] sid={"200070801729", "199962503830","199984310600","199923900794","199931611902"};
		String[] tNo={"0779335409","0764823956","0719088346","0765841464","0778558401"};
		
		System.out.println();
		System.out.println("ID	" + "\t" + "NAME	" + "\t" + "TELEPHONE NO");
		System.out.println();
		for(int i=0;i<5;i++){
			System.out.println(sid[i] + "\t" + sname[i] + "\t" + tNo[i]);
		}
		System.out.println();
    }	
}

class books{
}

class novel extends books{

	String[] nname={"Kaliyugaya","Madoldoowa","Viragaya","Goluhadawatha","Pirunu_Hadak","Senkottan","Manikkawatha","Prabuddha","Nomiyemi","Free_Fall","The_Spire","Jane_Eyre","Shirley","Hamlet","Othello","My_Childhood","Mother"};
    String[] nwriter={"Martin_Wickramasinghe","Martin_Wickramasinghe","Martin_Wickramasinghe","Karunasena_Jayalath","Karunasena_Jayalath","M.Prasad_Masimbula","M.Prasad_Masimbula","Mahagama_Sekara","Mahagama_Sekara","William_Golding","William_Golding","Charlotte_Bronte","Charlotte_Bronte","William_Shakespeare","William_Shakespeare","Maxim_Gorky","Maxim_Gorky"};
    String[] nmedium={"Sinhala","Sinhala","Sinhala","Sinhala","Sinhala","Sinhala","Sinhala","Sinhala","Sinhala","English","English","English","English","English","English","English","English"};
	double[] nprice={450.00,400.00,375.00,425.00,475.00,320.00,450.00,400.00,375.00,575.00,600.00,625.00,650.00,800.00,850.00,725.00,750.00};
	
	
	void new_novel()
	{
		for(int i=0;i<nname.length;i++){
			System.out.println(nname[i] + "\t\t" + nwriter[i] + "\t\t" + nmedium[i] + "\t\t" + nprice[i]);
			System.out.println();
		}
		System.out.println();	
	}

	void scan_novel()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Do you want to search 1-Book name, 2-Writer: ");
        int y= input.nextInt();
        if (y==1){
            System.out.print("Enter Book name: ");
            String x=input.next();
            for (int i=0; i<nname.length; i++) {
                if (Objects.equals(x,nname[i])) {
                    System.out.println(nname[i] + "\t\t" + nwriter[i] + "\t\t" + nmedium[i] + "\t\t" + nprice[i]);
                }
            }
        }
        else if (y==2){
            System.out.print("Enter Writer: ");
            String x=input.next();
            for (int i = 0; i < nwriter.length; i++) {
                if (Objects.equals(x, nwriter[i])) {
                    System.out.println(nname[i] + "\t\t" + nwriter[i] + "\t\t" + nmedium[i] + "\t\t" + nprice[i]);
                }
            }
        }
        else{
            System.out.println("Wrong Entry!");
        }
    }

}

class autobiographies extends books
{
	String[] aname={"Long_walk_for_freedom","Wings_of_Fire","Dreams_from_my_father","Walk_This_Way","My_Life","Baburnama","Steve_Jobs","The_Worlds","My_Story","Moonwalk","Night","Amaradewa","Mathithuma","Leela_Perumadura"};
    String[] awriter={"Nelson_Mendela","Abdul_Kalam","Barak_Obama","Aerosmith","Bill_Clinton","Babur","K.Blumenthal","J.P.Sartre","Marilyn_Monroe","Michael_Jackson","Elie_Wiesel","N.Nayanajith","Kannangara","S.Mahinha_Himi"};
    String[] amedium={"English","English","English","English","English","English","English","English","English","English","English","Sinhala","Sinhala","Sinhala"};
	double[] aprice={450.00,400.00,375.00,425.00,475.00,320.00,450.00,400.00,375.00,575.00,600.00,625.00,650.00,800.00};

	void new_autobiographies()
	{
		for(int i=0;i<aname.length;i++){
			System.out.println(aname[i] + "\t\t" + awriter[i] + "\t\t" + amedium[i] + "\t\t" + aprice[i]);
			System.out.println();
		}
		System.out.println();
	}
	void scan_autobiographies()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Do you want to search 1-Book name, 2-Writer: ");
        int y= input.nextInt();
        if (y==1){
            System.out.print("Enter Book name: ");
            String x=input.next();
            for (int i=0; i<aname.length; i++) {
                if (Objects.equals(x, aname[i])) {
                    System.out.println(aname[i] + "\t\t" + awriter[i] + "\t\t" + amedium[i] + "\t\t" + aprice[i]);
                }
            }
        }
        else if (y==2){
            System.out.print("Enter Writer: ");
            String x=input.next();
            for (int i = 0; i < awriter.length; i++) {
                if (Objects.equals(x, awriter[i])) {
                    System.out.println(aname[i] + "\t\t" + awriter[i] + "\t\t" + amedium[i] + "\t\t" + aprice[i]);
                }
            }
        }
        else{
            System.out.println("Wrong Entry!");
        }
    }
}


class LiteraryBooks extends books
{
	String[] lname={"Jane_Eyre","Invisible_Man","Emma","Lolita","Frankenstein","The_Moonstone","Thummanhandiya","Manikkawatha","nari_bena","Aba_Yahaluwo","Pitha_Maha"};
    String[] lwriter={"Charlotte_Bronte","Ralph_Ellison","Jane_Austen","Vladimir_Nabokov","Mary_Shelley","Wilkie_Collins","Mahagama_Sekara","M.Prasad_Masimbula","Dayananda_Gunawardana","T.B.Ilangarathna","k.jayathilaka"};
    String[] lmedium={"English","English","English","English","English","English","Sinhala","Sinhala","Sinhala","Sinhala","Sinhala"};
	double[] lprice={625.00,700.00,675.00,725.00,750.00,690.00,350.00,450.00,300.00,375.00,400.00};
	
	void new_LiteraryBooks(){
		for(int i=0;i<lname.length;i++){
			System.out.println(lname[i] + "\t\t" + lwriter[i] + "\t\t" + lmedium[i] + "\t\t" + lprice[i]);
			System.out.println();
		}
		System.out.println();
	}

	void scan_Literaraybooks()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Do you want to search 1-Book name, 2-Writer: ");
        int y= input.nextInt();
        if (y==1){
            System.out.print("Enter Book name: ");
            String x=input.next();
            for (int i=0; i<lname.length; i++) {
                if (Objects.equals(x, lname[i])) {
                    System.out.println(lname[i] + "\t\t" + lwriter[i] + "\t\t" + lmedium[i] + "\t\t" + lprice[i]);
                }
            }
        }
        else if (y==2){
            System.out.print("Enter Writer: ");
            String x=input.next();
            for (int i = 0; i < lwriter.length; i++) {
                if (Objects.equals(x, lwriter[i])) {
                    System.out.println(lname[i] + "\t\t" + lwriter[i] + "\t\t" + lmedium[i] + "\t\t" + lprice[i]);
                }
            }
        }
        else{
            System.out.println("Wrong Entry!");
        }
    }
}

class ScienceBooks extends books
{
	String[] sname={"Micrographia","why_war","Big Bang","The_Physics","Against_Method","Relativity","Cosmos	","Silent_Spring","The_Right_Stuff","Sentient"};
	String[] swriter={"Robert_Hooke","Albert_Einstein","Simon_Singh","Aristotle","Paul_Feyerabend","Albert_Einstein","Carl_Sagan","Rachel_Carson","Tom_Wolfe","Jackie_Higgins"};
	String[] smedium={"English","English","English","English","English","English","English","English","English","English"};
	double[] sprice={1920.00,1250.00,2750.00,2500.00,1800.00,2950.00,3560.00,2420.00,1750.00,2320.00};
	
	void new_ScienceBooks(){
		for(int i=0;i<sname.length;i++){
			System.out.println(sname[i] + "\t\t" + swriter[i] + "\t\t\t" + smedium[i] + "\t\t" + sprice[i]);
			System.out.println();
		}
		System.out.println();
	}

	void scan_Sciencebooks()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Do you want to search 1-Book name, 2-Writer: ");
        int y= input.nextInt();
        if (y==1){
            System.out.print("Enter Book name: ");
            String x=input.next();
            for (int i=0; i<sname.length; i++) {
                if (Objects.equals(x, sname[i])) {
                    System.out.println(sname[i] + "\t\t" + swriter[i] + "\t\t" + smedium[i] + "\t\t" + sprice[i]);
                }
            }
        }
        else if (y==2){
            System.out.print("Enter Writer: ");
            String x=input.next();
            for (int i = 0; i < swriter.length; i++) {
                if (Objects.equals(x, swriter[i])) {
                    System.out.println(sname[i] + "\t\t" + swriter[i] + "\t\t" + smedium[i] + "\t\t" + sprice[i]);
                }
            }
        }
        else{
            System.out.println("Wrong Entry!");
        }
    }
}

class facility
{
	void new_facility() {
        String[] fname = {"Free delivery service", "5% discount for Novels", "10% discount for Auto-biographies", "5% discount for Literary Books" , "10% discount for Science Books"};
		System.out.println();

        for (int i = 0; i < fname.length; i++) {
            System.out.println(fname[i]);
        }
        System.out.println();
    }

}

public class BookShop
{
	public static void main(String[] args)
	{
		System.out.println("\n--------------------------------------------------------------------------------");
        System.out.println("           	*** Welcome to Bookshop Management System ***");
        System.out.println("--------------------------------------------------------------------------------");
		
		Scanner input = new Scanner(System.in);

		staff obj1 = new staff();
		novel obj2 = new novel();
		autobiographies obj3 = new autobiographies();
		LiteraryBooks obj4 = new LiteraryBooks();
		ScienceBooks obj5 = new ScienceBooks();
		facility obj6 = new facility();
		
		int status1=1;
		while(status1==1)
		{
			System.out.println("\n--------------------------------------------------------------------------------");
        	System.out.println("        			*** MAIN MENU ***");
        	System.out.println("--------------------------------------------------------------------------------");
			
			System.out.print("Are you? \n1-Staff member \n2-Customer \nEnter Your Choice : ");
			int n1=input.nextInt();
			System.out.println();

			int status2=1;
			while(status2==1)
			{
				if(n1==1)
				{
					System.out.println("--------------------------------------------------------------------------------");
                	System.out.println("                          **STAFF SECTION**");
                	System.out.println("--------------------------------------------------------------------------------");

					System.out.println("1-Check Staff Members' Details");
					System.out.println("2-Check Novels List");
					System.out.println("3-Check Autobiographies List");
					System.out.println("4-Check Literary Books List");
					System.out.println("5-Check Science Books List");
					System.out.println("6-Check Facilities List");
					System.out.println("0-Main Menu\n");
					System.out.print("Enter Your Choice : ");
					
					int n2=input.nextInt();

					if (n2==1) {
						System.out.println("--------------------------------------------------------------------------------");
                		System.out.println("                          **STAFF DETAILS**");
                		System.out.println("--------------------------------------------------------------------------------");
						
						//staff obj1 = new staff();
						obj1.new_staff();

						System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
            			status2 = input.nextInt();
					}						
					else if (n2==2) {	
						System.out.println("--------------------------------------------------------------------------------");
               			System.out.println("                          **NOVELS LIST**");
               			System.out.println("--------------------------------------------------------------------------------");
						
						//novel obj2 = new novel();
						obj2.new_novel();

						System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
            			status2 = input.nextInt();
					}
					else if (n2==3) {
						System.out.println("--------------------------------------------------------------------------------");
                		System.out.println("                      **AUTO-BIOGRAPHIES LIST**");
                		System.out.println("--------------------------------------------------------------------------------");
						
						//autobiographies obj3 = new autobiographies();
						obj3.new_autobiographies();

						System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
            			status2 = input.nextInt();
					}
					else if (n2==4) {
						System.out.println("--------------------------------------------------------------------------------");
                		System.out.println("                       **LITERARY BOOKS LIST**");
                		System.out.println("--------------------------------------------------------------------------------");
						
						//LiteraryBooks obj4 = new LiteraryBooks();
						obj4.new_LiteraryBooks();

						System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
            			status2 = input.nextInt();
					}
					else if (n2==5) {
						System.out.println("--------------------------------------------------------------------------------");
                		System.out.println("                       **SCIENCE BOOKS LIST**");
                		System.out.println("--------------------------------------------------------------------------------");
						
						//ScienceBooks obj5 = new ScienceBooks();
						obj5.new_ScienceBooks();

						System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
            			status2 = input.nextInt();
					}
					else if (n2==6) {
						System.out.println("--------------------------------------------------------------------------------");
                		System.out.println("                         **FACILITIES LIST**");
                		System.out.println("--------------------------------------------------------------------------------");
					
						//facility obj6 = new facility();
						obj6.new_facility();

						System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
            			status2 = input.nextInt();
					}
					else if (n2==0) {
						status2=0;
					}
					else{
						System.out.println("Wrong Entry!\n");
					}
				}
				
				else if(n1==2) {
					System.out.println("--------------------------------------------------------------------------------");
					System.out.println("                        	**CUSTOMER SECTION**");
					System.out.println("--------------------------------------------------------------------------------");

					System.out.println("Select your choice : 1-Novels	 2-Autobiographies	 3-Literary Books	 4-Science Books 	5-Facilities");
					System.out.println("0-Main Menu");
					System.out.println(" **When you search a book by book name or writer name, you should enter the underscore instead of space between two words.** ");
					System.out.println("Example : Martin_Wickramasinghe");


					int n3 = input.nextInt();

					int status3 = 1;
					while (status3 == 1) {
						if (n3 == 1) {
							System.out.println("--------------------------------------------------------------------------------");
							System.out.println("                        	  		**NOVELS**");
							System.out.println("--------------------------------------------------------------------------------");

							System.out.println("Do you want to 1-Search book's name/Writer's name 	2-View all the book list");
							int n4 = input.nextInt();

							int status4 = 1;
							while (status4 == 1) {
								if (n4 == 1) {
									obj2.scan_novel();

									System.out.println("\nReturn to Back Press 0");
									status4 = input.nextInt();
								}
								else if (n4 == 2) {
									obj2.new_novel();

									System.out.println("\nReturn to Back Press 0");
									status4 = input.nextInt();
								}
								else {
									status4 = 0;
								}
								status3 = 0;
							}

						}
						else if (n3 == 2) {
							System.out.println("--------------------------------------------------------------------------------");
							System.out.println("                      	 	**AUTO-BIOGRAPHIES**");
							System.out.println("--------------------------------------------------------------------------------");

							System.out.println("Do you want to 1-Search book's name/Writer's name 	2-View all the book list");
							int n4 = input.nextInt();

							int status4 = 1;
							while (status4 == 1) {
								if (n4 == 1) {
									obj3.scan_autobiographies();

									System.out.println("\nReturn to Back Press 0");
									status4 = input.nextInt();
								}
								else if (n4 == 2) {
									obj3.new_autobiographies();

									System.out.println("\nReturn to Back Press 0");
									status4 = input.nextInt();
								}
								else {
									status4 = 0;
								}
								status3 = 0;
							}
						}
						else if (n3 == 3) {
							System.out.println("--------------------------------------------------------------------------------");
							System.out.println("                       		**LITERARY BOOKS**");
							System.out.println("--------------------------------------------------------------------------------");

							System.out.println("Do you want to 1-Search book's name/Writer's name 	2-View all the book list");
							int n4 = input.nextInt();

							int status4 = 1;
							while (status4 == 1) {
								if (n4 == 1) {
									obj4.scan_Literaraybooks();

									System.out.println("\nReturn to Back Press 0");
									status4 = input.nextInt();
								}
								else if (n4 == 2) {
									obj4.new_LiteraryBooks();

									System.out.println("\nReturn to Back Press 0");
									status4 = input.nextInt();
								}
								else {
									status4 = 0;
								}
								status3 = 0;
							}
						}
						else if (n3 == 4) {
							System.out.println("--------------------------------------------------------------------------------");
							System.out.println("                        	**SCIENCE BOOKS**");
							System.out.println("--------------------------------------------------------------------------------");

							System.out.println("Do you want to 1-Search book's name/Writer's name 	2-View all the book list");
							int n4 = input.nextInt();

							int status4 = 1;
							while (status4 == 1) {
								if (n4 == 1) {
									obj5.scan_Sciencebooks();

									System.out.println("\nReturn to Back Press 0");
									status4 = input.nextInt();
								}
								else if (n4 == 2) {
									obj5.new_ScienceBooks();

									System.out.println("\nReturn to Back Press 0");
									status4 = input.nextInt();
								}
								else {
									status4 = 0;
								}
								status3 = 0;
							}
						}
						else if (n3 == 5) {
							System.out.println("--------------------------------------------------------------------------------");
							System.out.println("                         		**FACILITIES**");
							System.out.println("--------------------------------------------------------------------------------");

							//facility obj6 = new facility();
							obj6.new_facility();

							System.out.println("\nReturn to Back Press 0");
							status3 = input.nextInt();
						}
						else if (n3 == 0) {
							status3 = 0;
							status2 = 0;
						}
						else {
							System.out.println("Wrong Entry!\n");
							status3 = 0;
						}
					}
				}
				else {
					System.out.println("Wrong Entry!\n");
					System.out.print("Are you? \n1-Staff member \n2-Customer \nEnter Your Choice : ");
					n1=input.nextInt();
					System.out.println();
				}
			}
		}
	}
}