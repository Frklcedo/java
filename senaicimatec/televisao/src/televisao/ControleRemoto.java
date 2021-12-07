package televisao;

public class ControleRemoto {
	private boolean statustv;
	private int volume;
	private int canal;
	
	public ControleRemoto(){
		desligarTV();
		System.out.println();
		System.out.println("Canal:\t" + this.canal);
		System.out.println("Vol: \t" + this.volume);
		System.out.println();
	}
	public void ligarTV() {
		statustv = true;
	}
	public void desligarTV() {
		statustv = false;
	}
	public String alterarVolume(char ad) {
		if(statustv) {
			if(ad=='+') {
				if(volume<100) {
					volume++;
				}
				if(volume==100) {
					return "Volume MÁXIMO";
				}
				else {
					return String.valueOf(volume);
				}
			}
			else if(ad=='-') {
				if(volume>0) {
					volume--;
				}
				if(volume==0) {
					return "MUDO";
				}
				else {
					return String.valueOf(volume);
				}
			}
		}
		return null;
	}
	
	public int alterarCanal(char ch) {
		if(statustv) {
			if(ch== '>' && canal<1000) {
				canal++;
			}
			else if(ch=='<' && canal>0) {
				canal--;
			}
			return canal;
		}
		return 0;
	}
	
	public int setCanal(int canal) {
		if(statustv) {
			if(canal<1000 && canal>=0) {
				this.canal=canal;
			}
			return this.canal;
		}
		return 0;
	}
	
	public void status() {
		System.out.println();
		if(statustv) {
			System.out.println("Televisão ligada");
		}
		else {
			System.out.println("Televisão desligada");
		}
		System.out.println("Canal: " + canal);
		System.out.println("Volume: " + volume);
		System.out.println();
	}
}
