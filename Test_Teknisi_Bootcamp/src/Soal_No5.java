import java.util.Scanner;


public class Soal_No5 {
	Scanner newScanner=new Scanner(System.in);
		    public static void main(String[] args) throws Exception {
		    	
		    	Soal_No5 mc=new Soal_No5();
				int pilihanmenu=0;
				do {
					System.out.println("Ujian Bootcamp Days3 ADL");
					System.out.println("==========================");
					System.out.println("1. Soal No. 6 ");
					System.out.println("2. Soal No. 5 ");
					System.out.println("===========================");
					System.out.print("Pilihan Anda :");
					pilihanmenu=mc.newScanner.nextInt();
					mc.menuOpsi(pilihanmenu);
				}while(pilihanmenu!=0);
			}
			
			public void menuOpsi(int pilihanmenu) {
				switch (pilihanmenu) {
					case 1:
						soal6();
						break;
					case 2:
						soal5();
						break;
				}
			}
			
			public void soal6() {
		    	Scanner scan = new Scanner(System.in);
		        int x;
		        
		        boolean menu =true;
		        while(menu)
		        {
		         System.out.print("Masukkan nilai x =");
		         x = scan.nextInt();
		        
		         System.out.println("\nCetak Segitiga Siku-siku");
		         System.out.println("==========================");
		         for (int i=1;i<=x;i++){
		            for(int j=1;j<=i;j++){
		                System.out.print("*");
		            }
		                System.out.println();
		         }
		       }    
		    }
			
			public void soal5() {
		        Scanner input = new Scanner(System.in);
				 System.out.print(" Masukan jumlah bilangan :  ");
			        
			        int n = input.nextInt();
			        long fib[] = new long[n];
			        
			        fib[0] = 1;
			        fib[1] = 2;
			        
			        for (int i = 2; i<n; i++){
			            fib [i] = fib[i-1] + fib [i-2];
			        }
			        
			        for (int i = 0; i <n; i++){
			            System.out.print(fib[i] + " ");
			        }
			        
			    } 
			}
		   
