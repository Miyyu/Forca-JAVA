package forca;

public class Contador {
    int numero;

    public Contador() {
        numero = 0;
    }
    
    private void contar(){
        this.numero += 1;
    }
    
    public void vencer(String palavra){
        System.out.println(palavra);
        System.out.println("✧ VOCÊ GANHOU! ✧");
    }
    
    public boolean exibirForca(){
        contar();
        
        switch(this.numero){
        
        case 1:
            System.out.println("☹");
            break;
        
        case 2:
            System.out.println(" ☹");
            System.out.println(" |");
            break;
        
        case 3:
            System.out.println("  ☹\n ╼|");
            break;
            
        case 4:
            System.out.println("  ☹\n ╼|╾");
            break;
            
        case 5:
            System.out.println("  ☹\n ╼|╾ \n /");
            break;
            
        case 6:
            System.out.println("  ☹\n -|╾ ");
            System.out.println(" ╱╲\n");
            System.out.println("☠ VOCÊ PERDEU ☠");
            return false;
        }
        
        return true;
    }
}
