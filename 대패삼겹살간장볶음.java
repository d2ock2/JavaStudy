import javax.swing.JOptionPane;

public class ���л��찣�庺�� {
	public static void main(String[] args) {
		String x = JOptionPane.showInputDialog("�� �κ� ����� �ſ���?");
		print(x);
	}
	public static void print(String x) {
		System.out.println(Integer.parseInt(x)+"�κ� ���ۿ� �ʿ��� ���\n");
		System.out.println("���л��� "+(150*(Integer.parseInt(x)))+"g"+" / ���� "+(0.5*Integer.parseInt(x))+"��");
		System.out.println("���� "+(0.5*Integer.parseInt(x))+"ū��"+" / ���� "+(0.5*Integer.parseInt(x))+"ū��");
		System.out.println("���� "+(0.5*Integer.parseInt(x))+"ū��"+" / ��ġ�� "+(0.5*Integer.parseInt(x))+"������");
		System.out.println("���� "+(0.25*Integer.parseInt(x))+"ū��"+" / �������� "+(0.25*Integer.parseInt(x))+"ū��");
		System.out.println("���� "+(0.25*Integer.parseInt(x))+"������");
		System.out.println("�������� \n\n "
				+ "1. �غ�� �з��� ����, ����, ��������, ����, ��ġ��, ���߸� �ְ� ����ҽ��� ������ݴϴ�. \n "
				+ "2. �ҿ� ���л����� �ְ� �ͱ����� ��鼭 �����ݴϴ�.(������ ������ ä�� ������ �ʾƿ�~!) \n "
				+ "3. �귯 ���� �⸧�� ŰģŸ�÷� �۾��ּ���. \n "
				+ "4. ���� ������ �� ������ �о���� ����ҽ��� �ҿ� �ξ� ��¦ �����ּ���. \n "
				+ "5. ����ҽ��� ��� ���̵��� �յڷ� �����̸鼭 �븩�븩 �ٻ��ϰ� �����ּ���. \n "
				+ "6. �ϼ��� �丮�� ���ÿ� ��� �� ���� �ۼ� �� ���Ŀ� ���� �ѷ��ָ� ��!@_@ ���ְ� �弼��~!");
		// �����Ǵ� http://www.10000recipe.com/recipe/6884486 ���⸦ �����߽��ϴ�.
	}
}