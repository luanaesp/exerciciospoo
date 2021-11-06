import java.util.Scanner; 
public class Principal { // declaração da classe

	public static void main(String[] argumentos) {
		
		
		Scanner opcao = new Scanner(System.in);							
		final double distanciaDaTerraALuaEmQuilometros = 382000;        
		final double areaCampoFutebolMetrosQuadrados = 8250;			
		final double volumePiscinaOlimpicaMetrosCubicos = 1890;			
		final double velocidadeDaLuzEmQuilometrosPorHora = 1080000000;  
		final double periodoDeGestacaoElefanteIndianoEmDias = 624;		

		// interação com o usuário e impressão de dados relativos á distância da terra á lua
		System.out.println("****************************** Distância Média da Terra à Lua *****************************************");
		distanciaDaTerraALua(distanciaDaTerraALuaEmQuilometros, opcao);
		
		// interação com o usuário e impressão de dados relativos a área de um campo de futebol
		System.out.println("*********************** Área de um Campo de Futebol - Conversão de Unidades ***************************");
		areaCampoFutebol(areaCampoFutebolMetrosQuadrados, opcao);
		
		// impressão de dados relativos a um volume de uma piscina olímpica
		System.out.println("******************** Volume de uma Piscina - Expresso em Diferentes Unidades **************************");
		volumePiscinaOlimpica(volumePiscinaOlimpicaMetrosCubicos);
		
		System.out.println(); // quebra de linha para organização das informações no terminal
		// impressão de dados relativos à velocidade da luz
		System.out.println("********************** Velocidade da Luz - Expressa em Diferentes Unidades ****************************");
		velocidadeDaLuz(velocidadeDaLuzEmQuilometrosPorHora);
		
		System.out.println(); // quebra de linha para organização das informações no terminal
		// impressão de dados relativos ao período de gestação de um elefante indiano
		System.out.println("**************************** Período de Gestação de um Elefante Indiano *******************************");
		gestacaoElefanteIndiano(periodoDeGestacaoElefanteIndianoEmDias);
		
		// várias conversões de unidades de temperatura são apresentadas aqui, utilizando métodos estáticos da classe MudancaEscalaDeTemperatura
		System.out.println(); // quebra de linha para organização das informações no terminal
		System.out.println("0° Celsius são " + MudancaEscalaDeTemperatura.celsiusParaKelvin(0) + " K");
		System.out.println("0° Celsius são " + MudancaEscalaDeTemperatura.celsiusParaFahrenheit(0)+"° F");
		System.out.println("100° Celsius são " + MudancaEscalaDeTemperatura.celsiusParaKelvin(100)+" K");
		System.out.println("100° Celsius são " + MudancaEscalaDeTemperatura.celsiusParaFahrenheit(100)+"° F");
		System.out.println("309 kelvin são " + MudancaEscalaDeTemperatura.kelvinParaFahrenheit(309)+"° F");
		System.out.println("97 ° fahrenheit são " + MudancaEscalaDeTemperatura.fahrenheitParaKelvin(97)+" K");
		
		System.out.println(); // quebra de linha para organização das informações no terminal
		System.out.println("******************* Testes para a Classe DemoConversaoDeUnidadesDeComprimento *************************");
		System.out.println(); // quebra de linha para organização das informações no terminal
		// chamamos o método main, da classe DemoConversaoDeUnidadesDeComprimento, como subrotina da nossa aplicação
		DemoConversaoDeUnidadesDeComprimento.main(argumentos);				
		
	} 

	public static void distanciaDaTerraALua(double quilometros, Scanner opcaoEscolhida) {
		
		byte escolha;                            // a escolha do usuário
		
		System.out.println("\nVocê deseja que a distância seja convertida em milhas ou pés? (escolha 1 para milhas ou 2 para pés)\n");
		escolha = opcaoEscolhida.nextByte(); // guardando o conteúdo fornecido pelo usuário na variável escolha
		
		while(escolha!=1 && escolha!=2) { // enquanto a escolha não for válida
			
			System.out.println("Escolha uma opção válida! Milhas (1) ou Pés (2):"); // peça ao usuário um valor válido
			escolha = opcaoEscolhida.nextByte(); // guarde o valor informado na variável escolha
			
		} // fim do while
		
		System.out.println(); // quebra de linha para organização das informações no terminal
		
		if(escolha==1) { // se a escolha for milhas
			
			// mostra o valor da distância convertido em milhas
			System.out.println("A distância média da terra à lua é de " + ConversaoDeUnidadesDeComprimento.quilômetrosParaMilhas(quilometros)+" milhas\n");
			
		}
		else { // senão
			
			// mostra o valor convertido em pés
			System.out.println("A distância média da terra à lua é de " + ConversaoDeUnidadesDeComprimento.quilômetrosParaPés(quilometros)+" pés\n");
			
		} // fim-se
		
	} // fim do método distanciaDaTerraALua
	
	
	public static void areaCampoFutebol(double areaEmMetrosQuadrados, Scanner opcaoEscolhida) {
		
		byte escolha; // a escolha do usuário
		
		System.out.println("\nVocê deseja que a área seja convertida em pés quadrados, acres ou centímetros quadrados? \n escolha 1: para pés quadrados\n escolha 2: para acres\n escolha 3: para centímetros quadrados\n");
		escolha = opcaoEscolhida.nextByte(); // guardamos o conteúdo fornecido pelo usuário na variável escolha
		
		while(escolha!=1 && escolha!=2 && escolha!=3) { // enquanto a escolha não for válida
			
			System.out.println("Escolha uma opção válida! Pés Quadrados (1), Acres (2) ou Centímetros Quadrados (3):"); // peça ao usuário uma valor válido
			escolha = opcaoEscolhida.nextByte(); // guarde o valor informado na variável escolha
			
		} // fim do while
		
		System.out.println(); // quebra de linha para organização das informações no terminal
		
		if(escolha==1) { // se a escolha for pés quadrados
			
			// mostra o valor da área convertido em pés quadrados
			System.out.println("A área do campo de futebol é " + ConversaoDeUnidadesDeArea.metrosQuadradosParaPésQuadrados(areaEmMetrosQuadrados)+" pés quadrados\n");
			
		}
		else { // senão
			
			if(escolha==2) { // se a escolha for acres
			
				// mostra o valor da área convertido em acres
				System.out.println("A área do campo de futebol é " + ConversaoDeUnidadesDeArea.pésQuadradosParaAcres(ConversaoDeUnidadesDeArea.metrosQuadradosParaPésQuadrados(areaEmMetrosQuadrados))+" acres\n");
				
			}			
			else { // senão
				
				// mostra o valor da área convertido em centímetros quadrados
				System.out.println("A área do campo de futebol é " + ConversaoDeUnidadesDeArea.metrosQuadradosParaCentímetrosQuadrados(areaEmMetrosQuadrados) + " centímetros quadrados\n");
								
			} // fim-se
			
		} // fim-se
		
	} // fim do método areaCampoFutebol	
	
	
	public static void volumePiscinaOlimpica(Double volumePiscinaOlimpicaMetrosCubicos) {
		
		
		double litros = ConversaoDeUnidadesDeVolume.metrosCúbicosParaLitros(volumePiscinaOlimpicaMetrosCubicos);
		
		System.out.println(); // quebra de linha para organização dos dados no terminal
		
		System.out.println("O volume da piscina é " + litros + " litros"); // mostra o valor do volume em litros
		System.out.println("O volume da piscina é " + ConversaoDeUnidadesDeVolume.metrosCúbicosParaPésCúbicos(volumePiscinaOlimpicaMetrosCubicos) + " pés cúbicos"); // mostra o valor do volume em pés cúbicos
		System.out.println("O volume da piscina é " + ConversaoDeUnidadesDeVolume.litrosParaCentímetrosCúbicos(litros) + " centímetros cúbicos"); // mostra o valor do volume em centímetros cúbicos
		
	} // fim do método volumePiscinaOlimpica
	
	
	public static void velocidadeDaLuz(double velocidadeDaLuzEmQuilometrosPorHora) {
		
		System.out.println(); // quebra de linha para organização dos dados no terminal
		System.out.println("A velocidade da luz é " + ConversaoDeUnidadesDeVelocidade.quilômetrosPorHoraParaMilhasPorHora(velocidadeDaLuzEmQuilometrosPorHora) + " milhas por hora"); // mostra o valor da velocidade da luz em milhas por hora
		System.out.println("A velocidade da luz é " + ConversaoDeUnidadesDeVelocidade.quilômetrosPorHoraParaMetrosPorSegundo(velocidadeDaLuzEmQuilometrosPorHora) + " m/s");          // mostra o valor da velocidade da luz em metros por segundo
		System.out.println("A velocidade da luz é " + ConversaoDeUnidadesDeVelocidade.quilômetrosPorHoraParaPésPorSegundo(velocidadeDaLuzEmQuilometrosPorHora) + " pés por segundo"); // mostra o valor da velocidade da luz em pés por segundo
		
	} // fim do método velocidadeDaLuz
	
	
	public static void gestacaoElefanteIndiano(double periodoEmDias) {
		
	
		double segundos = ConversaoDeUnidadesDeTempo.diasParaSegundos(periodoEmDias); // o tempo em segundos correspondente ao número de dias
		int segundosInteiros = (int)segundos;										  // dias de gestação representados em números inteiros
		
		System.out.println(); // quebra de linha para organização dos dados no terminal
		System.out.println("O período de gestação de um elefante indiano é " + periodoEmDias + " dias");												// imprime o tempo de gestação em dias
		System.out.println("O período de gestação de um elefante indiano é " + ConversaoDeUnidadesDeTempo.diasParaHoras(periodoEmDias) + " horas");     // imprime o tempo de gestação em horas
		System.out.println("O período de gestação de um elefante indiano é " + ConversaoDeUnidadesDeTempo.diasParaMinutos(periodoEmDias) + " minutos"); // imprime o tempo de gestação em minutos
		System.out.println("O período de gestação de um elefante indiano é " + segundos + " segundos");													// imprime o temop de gestação em segundos
		System.out.println("Se a gestação de um elefante indiano começasse agora, levaria " + Relogio.relogio(segundosInteiros)+" para acabar.");		// imprime o prazo de um tempo de gestação (no formato relógio)
				
	} 
	
} 