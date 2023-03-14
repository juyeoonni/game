package game;

public class Wand {
	private String name; // �������� �̸�
	private double power; // �������� ����

	public String getName() {
		return name;
	}

	// �̸��� null �� �� ����, �ݵ�� 3���� �̻��̾�� �Ѵ�
	public void setName(String name) {
		if (name != null && name.length() > 3) {
			throw new IllegalArgumentException("�����糪 �������� �̸��� null �� �� ����, �ݵ�� 3���� �̻��̾�� �Ѵ�");
		}
		this.name = name;
	}

	public double getPower() {
		return power;
	}

	// �������� ������ 0.5 �̻� 100.0 ����
	public void setPower(double power) {
		if (0.5 > power || power > 100.0) {
			throw new IllegalArgumentException("�������� ������ 0.5 �̻� 100.0 ���Ͽ��� �Ѵ�.");
		}

		this.power = power;
	}

}
