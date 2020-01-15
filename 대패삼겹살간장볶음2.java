import javax.swing.JOptionPane;

public class 대패삼겹살간장볶음2 {
	public static void main(String[] args) {
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("몇 인분 만드실 거에요?"));
		
		double[] spoon = new double[2];
		spoon[0]=0.5*x;
		spoon[1]=0.25*x;	
		System.out.println(x+"인분 제작에 필요한 재료\n");
		System.out.println("대패삼겹살 "+(150*x)+"g");
		int i=0;
			System.out.println("대파 "+spoon[i]+"대, " + "참깨 "+spoon[i]+"큰술, "+ "간장 "+spoon[i]+"큰술, "+ "맛술 "+spoon[i]+"큰술"+"참치액 "+spoon[i]+"작은술");
			i=i+1;
			System.out.println("설탕 "+spoon[i]+"큰술, " + "다진마늘 "+spoon[i]+"큰술, "+ "후추 "+spoon[i]+"작은술");
		
		System.out.println("\n조리순서 \n\n "
				+ "1. 준비된 분량의 간장, 설탕, 다진마늘, 맛술, 참치액, 후추를 넣고 간장소스를 만들어줍니다. \n "
				+ "2. 팬에 대패삼겹살을 넣고 익기전에 펴면서 구워줍니다.(익으면 뭉쳐진 채로 펴지지 않아요~!) \n "
				+ "3. 흘러 나온 기름은 키친타올로 닦아주세요. \n "
				+ "4. 대패 삼겹살을 한 쪽으로 밀어놓고 간장소스를 팬에 부어 살짝 졸여주세요. \n "
				+ "5. 간장소스가 고루 섞이도록 앞뒤로 뒤적이면서 노릇노릇 바삭하게 구워주세요. \n "
				+ "6. 완성된 요리를 접시에 담고 그 위에 송송 썬 대파와 깨를 뿌려주면 끝!@_@ 맛있게 드세요~!");
		// 레시피는 http://www.10000recipe.com/recipe/6884486 여기를 참조했습니다.
	}
}