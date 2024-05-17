package dispositvo.mp3;

import dispositvo.ReprodutorMusical;

public class Mp3 implements ReprodutorMusical {

  @Override
  public void tocarMusica() {    
    System.out.println("Tocando joelma");
  }

  @Override
  public void pausarMusica() {
    
   System.out.println("musica pausada");
  }

  @Override
  public void mudarMusica() {
    System.out.println("mudando a musica");
  }
    
  
} 
