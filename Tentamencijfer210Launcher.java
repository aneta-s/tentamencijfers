package maintentamencijfer210;
import java.util.Scanner;

/**
 * @author aneta
 *
 */
public class Tentamencijfer210Launcher {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int aantalcijfers=0;
		double gemiddelde=0;
		int aantalvoldoendes=0;
		double hoogstecijfer=0;

		System.out.println("hoe veel cijfers invoeren");
		aantalcijfers=input.nextInt();
		while (aantalcijfers==0) {
			System.out.println("aaantal cijfer moet groter zijn dan 0");
			System.out.println("hoe veel cijfers invoeren");
			aantalcijfers=input.nextInt();
		}
		double [] cijferstudent=new double [aantalcijfers];
		for(int i=0;i<aantalcijfers;i++) {
			System.out.println("cijfer student "+(i+1)+" : ");
			cijferstudent[i]=input.nextDouble();
		}
		System.out.println("aantal cijfers: "+aantalcijfers);
		gemiddelde=berekengemiddelde(cijferstudent,aantalcijfers);
		System.out.println("gemiddelde: "+gemiddelde);
		aantalvoldoendes=berekenaantalvoldoendes(cijferstudent,aantalcijfers);
		System.out.println("aantal vodoendes: "+aantalvoldoendes);
		hoogstecijfer=berekenhoogstecijfer(cijferstudent,aantalcijfers);
		System.out.println("hoogste cijfer: "+hoogstecijfer);

	}
	public static double berekengemiddelde(double [] cijferstudent,int aantalcijfers) {
		double gemiddelde=0;
		double somcijfers=0;

		for(int i=0;i<aantalcijfers;i++) {
			somcijfers+=cijferstudent[i];
		}
		gemiddelde=somcijfers/aantalcijfers;
		return gemiddelde;

	}

	public static int berekenaantalvoldoendes(double [] cijferstudent,int aantalcijfers) {
		int aantalvoldoendes=0;
		
		for(int i=0;i<aantalcijfers;i++) {
			if(cijferstudent[i]>=5.5) {
				aantalvoldoendes++;
			}
		}
		return aantalvoldoendes;
	}
	public static double berekenhoogstecijfer(double [] cijferstudent,int aantalcijfers) {
		double hoogstecijfer=0;
		for (int i=0;i<aantalcijfers;i++) {
			if(cijferstudent[i]<cijferstudent[i]) {
				cijferstudent[i]=hoogstecijfer;
			}
		}
		return hoogstecijfer;
	}

}
