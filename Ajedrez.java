class Main {
  
  public static void main(String[] args) {
    
    int tablero [][] = new int[1000][1000];
    int comienzoRojo = 0;
    
    //rojo = 1, azul = 0.
    for(int i = 0; i<1000; i++){
      for(int j = comienzoRojo; j<1000; j++){
        for(int z=0; z<comienzoRojo; z++){
          tablero[i][z]=1;
        }
        tablero[i][j]=2;
      }
      
      if(comienzoRojo==499){
        comienzoRojo+=2;
      }else{
        comienzoRojo+=1;
      }
    }

    for(int j=0; j<1000;j++){
        tablero[999][j]=1;
    }

    verificarTablero(tablero);
  }

  public static void verificarTablero(int[][] tablero){
    int rojo = 0;
    int azul = 0;
    for(int i = 0; i<1000; i++){
      for(int j=0;j<1000;j++){
        if(tablero[i][j]==1){
          rojo +=1;
        }else{
          azul +=1;
        }
      }
    }
    System.out.print("Rojos: " + rojo + " Azules: " + azul);
  }
  
}
