import javax.swing.JOptionPane;

public class ���л��찣�庺��2 {
	public static void main(String[] args) {
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("�� �κ� ����� �ſ���?"));
		
		double[] spoon = new double[2];
		spoon[0]=0.5*x;
		spoon[1]=0.25*x;	
		System.out.println(x+"�κ� ���ۿ� �ʿ��� ���\n");
		System.out.println("���л��� "+(150*x)+"g");
		int i=0;
			System.out.println("���� "+spoon[i]+"��, " + "���� "+spoon[i]+"ū��, "+ "���� "+spoon[i]+"ū��, "+ "���� "+spoon[i]+"ū��"+"��ġ�� "+spoon[i]+"������");
			i=i+1;
			System.out.println("���� "+spoon[i]+"ū��, " + "�������� "+spoon[i]+"ū��, "+ "���� "+spoon[i]+"������");
		
		System.out.println("\n�������� \n\n "
				+ "1. �غ�� �з��� ����, ����, ��������, ����, ��ġ��, ���߸� �ְ� ����ҽ��� ������ݴϴ�. \n "
				+ "2. �ҿ� ���л����� �ְ� �ͱ����� ��鼭 �����ݴϴ�.(������ ������ ä�� ������ �ʾƿ�~!) \n "
				+ "3. �귯 ���� �⸧�� ŰģŸ�÷� �۾��ּ���. \n "
				+ "4. ���� ������ �� ������ �о���� ����ҽ��� �ҿ� �ξ� ��¦ �����ּ���. \n "
				+ "5. ����ҽ��� ��� ���̵��� �յڷ� �����̸鼭 �븩�븩 �ٻ��ϰ� �����ּ���. \n "
				+ "6. �ϼ��� �丮�� ���ÿ� ��� �� ���� �ۼ� �� ���Ŀ� ���� �ѷ��ָ� ��!@_@ ���ְ� �弼��~!");
		// �����Ǵ� http://www.10000recipe.com/recipe/6884486 ���⸦ �����߽��ϴ�.
	}
}