import javax.swing.JOptionPane;

public class JogoComMatriz {
	public static void main(String[] args) {
	       Jogador1 j1 = new Jogador1();
	       Jogador2 j2 = new Jogador2();
	       
	       String p1="1";
	       String p2="2";
	       String p3="3";
	       String p4="4";
	       String p5="5";
	       String p6="6";
	       String p7="7";
	       String p8="8";
	       String p9="9";
	    
	       String nome = JOptionPane.showInputDialog("Digite Play para começar");
	     
	       while(nome.equalsIgnoreCase("P")) {
	    	  
	    	   String escolha = JOptionPane.showInputDialog("Digite a posição de 1 a 9 ");
	    	   String jog = JOptionPane.showInputDialog("Qual jogador da rodada, 1 ou 2");
	    	  
	    	   if(jog.equalsIgnoreCase("1"))
	    		   jog=j1.forma;
	    	  else jog=j2.forma;
	    	    
	    	 
	    	   
	    	   
	         if (p3==p6 && p6==p9) {
	    	  System.out.println("Você ganhou");
	    		  break;
	    	 }
	         else  if (p3.equalsIgnoreCase(p6) && p6.equalsIgnoreCase(p9)) {
	    		   System.out.println("Você ganhou");
	    		   break;
	    	   }
	    	     else if (p1==p2 && p2==p3) {
	    		   System.out.println("Você ganhou");
	    		   break;
	    	   }
	    	   else  if (p1==p5 && p5==p9) {
	    		   System.out.println("Você ganhou");
	    		   break;
	    	   }
	    	   else if (p1==p4 && p4==p7) {
	    		   System.out.println("Você ganhou");
	    		   break;
	    	   }
	    	   
	    	   else if (p3==p5 && p5==p7) {
	    		   System.out.println("Você ganhou");
	    		   break;
	    	   }
	    	   
	    	   else if (p4==p5 && p5==p6) {
	    		   System.out.println("Você ganhou");
	    		   break;
	    	   }
	    	   
	    	   else if (p7==p8 && p8==p9) {
	    		   System.out.println("Você ganhou");
	    		   break;
	    	   }
	       nome = JOptionPane.showInputDialog("Digite Play para jogar de novo ou Stop para parar");
	      }
		}
}
