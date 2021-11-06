public class CartaDeBaralho{ // declara a classe
	
	byte valor;  // valor da carta (1 a 13)
	byte naipe;  // o naipe da carta (1 a 4)
	
	
	CartaDeBaralho(byte umValor, byte umNaipe){
		
		if(umValor < 1 || umValor > 13){ // se o valor da carta não estiver no intervalo [1,13]
			
			valor = 1;  // o valor da carta receberá um valor default
			
		}
		else{ 
			
			valor = umValor; // inicializa o campo valor do objetivo com o valor passado como argumento
		
		} 
		
		if(umNaipe < 1 || umNaipe > 4){ // se o naipe da carta não for um naipe válido
			
			naipe = 1; // o naipe será por padrão ouros
			
		}
		else{ 
			
			naipe = umNaipe; // a variável naipe receberá o conteúdo passado como argumento
		
		} 
		
	} // fim do construtor completo
	
	
	CartaDeBaralho(byte umValor){
		
		this(umValor,(byte)1);	// chamada em cascata ao construtor completo
		
	} // fim do construtor sobrecarregado com apenas um argumento
	
	
	CartaDeBaralho(){
		
		this((byte)1);	// chamada em cascata dos outros construtores da classe
		
	} // fim do construtor default
	
	
	public void imprimeCarta(){
		
		switch (valor){ 
			
			case 1: 
				
				switch(naipe){
					
					case 1:
						
						System.out.println("Ás de Ouros");
						break;
						
					case 2:
						
						System.out.println("Ás de Paus");
						break;						 
						
					case 3:
						
						System.out.println("Ás de Copas");
						break;
						
					case 4:
						
						System.out.println("Ás de Espadas");
						break;
										
				}
				
				break;

			case 2:
				
				switch(naipe){
					
					case 1:
						
						System.out.println("Dois de Ouros");
						break;
						
					case 2:
						
						System.out.println("Dois de Paus");
						break;
												
					case 3:
						
						System.out.println("Dois de Copas");
						break;
												
					case 4:
						
						System.out.println("Dois de Espadas");
						break;
											
				}

				break;
				
			case 3:
				
				switch(naipe){
					
					case 1:
						
						System.out.println("Três de Ouros");
						break;
						
					case 2:
						
						System.out.println("Três de Paus");
						break;
						
					case 3:
						
						System.out.println("Três de Copas");
						break;
						
					case 4:
						
						System.out.println("Três de Espadas");
						break;
						
				}
				
				break;

			case 4:
			
				switch(naipe){
					
					case 1:
						
						System.out.println("Quatro de Ouros");
						break;
						
					case 2:
						
						System.out.println("Quatro de Paus");
						break;
						
					case 3:
						
						System.out.println("Quatro de Copas");
						break;
						
					case 4:
						
						System.out.println("Quatro de Espadas");
						break;

				}

				break;
				
			case 5:
				
				switch(naipe){
					
					case 1:
						
						System.out.println("Cinco de Ouros");
						break;
						
					case 2:
						
						System.out.println("Cinco de Paus");
						break;
						
					case 3:
						
						System.out.println("Cinco de Copas");
						break;
						
					case 4:
						
						System.out.println("Cinco de Espadas");
						break;
				
				}
				
				break;

			case 6:
				
				switch(naipe){
					
					case 1:
						
						System.out.println("Seis de Ouros");
						break;
						
					case 2:
						
						System.out.println("Seis de Paus");
						break;
						
					case 3:
						
						System.out.println("Seis de Copas");
						break;
						
					case 4:
						
						System.out.println("Seis de Espadas");
						break;
				
				}
				
				break;

			case 7:
				
				switch(naipe){
					
					case 1:
						
						System.out.println("Sete de Ouros");
						break;
						
					case 2:
						
						System.out.println("Sete de Paus");
						break;
						
					case 3:
					
						System.out.println("Sete de Copas");
						break;
						
					case 4:
						
						System.out.println("Sete de Espadas");
						break;

				}
				
				break;

			case 8:
				
				switch(naipe){
					
					case 1:
						
						System.out.println("Oito de Ouros");
						break;
						
					case 2:
						
						System.out.println("Oito de Paus");
						break;
						
					case 3:
						
						System.out.println("Oito de Copas");
						break;
						
					case 4:
						
						System.out.println("Oito de Espadas");
						break;

				}
				
				break;

			case 9:
				
				switch(naipe){
					
					case 1:
						
						System.out.println("Nove de Ouros");
						break;
						
					case 2:
						
						System.out.println("Nove de Paus");
						break;
						
					case 3:
						
						System.out.println("Nove de Copas");
						break;
						
					case 4:
						
						System.out.println("Nove de Espadas");
						break;
				
				}
				
				break;

			case 10:
				
				switch(naipe){
					
					case 1:
						
						System.out.println("Dez de Ouros");
						break;
						
					case 2:
						
						System.out.println("Dez de Paus");
						break;
						
					case 3:
						
						System.out.println("Dez de Copas");
						break;
						
					case 4:
						
						System.out.println("Dez de Espadas");
						break;
					
				}
				
				break;

			case 11:
				
				switch(naipe){
					
					case 1:
						
						System.out.println("Valete de Ouros");
						break;
						
					case 2:
						
						System.out.println("Valete de Paus");
						break;
						
					case 3:
						
						System.out.println("Valete de Copas");
						break;
						
					case 4:
						
						System.out.println("Valete de Espadas");
						break;
				
				}
				
				break;

			case 12:
				
				switch(naipe){
					
					case 1:
						
						System.out.println("Dama de Ouros");
						break;
						
					case 2:
						
						System.out.println("Dama de Paus");
						break;

					case 3:
						
						System.out.println("Dama de Copas");
						break;
						
					case 4:
						
						System.out.println("Dama de Espadas");
						break;

				}

				break;
				
			case 13:
				
				switch(naipe){
					
					case 1:
						
						System.out.println("Rei de Ouros");
						break;
						
					case 2:
						
						System.out.println("Rei de Paus");
						break;
						
					case 3:
						
						System.out.println("Rei de Copas");
						break;
						
					case 4:
						
						System.out.println("Rei de Espadas");
						break;

				}
			
				break;
			
		} // fim do switch referente ao valor da carta
		
	} // fim do método imprimiCarta
	
} // fim da classe CartaDeBaralho