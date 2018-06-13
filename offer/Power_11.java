package lets.code.every.offer;
/**
 * ��ָoffer ������11����ֵ�������η�
 * ʵ�ֺ���double Power(double base,int exponent)����base��exponent�η�
 * ����ʹ�ÿ⺯����ͬʱ����Ҫ���Ǵ�������
 * @author Administrator
 *
 */
public class Power_11 {
	//����һ
	public static double power_method_1(double base,int exponent)
	{
		double result = 1.0;
		for(int i = 1;i <= exponent; i++)
			result *= base;
		return result;
	}
	//������
	public static double power_method_2(double base,int exponent)
	{
		if(equal(base, 0.0) && exponent < 0) //����ָ��Ϊ����������Ϊ0
		{
			return 0.0;
		}
		double result = 1.0;
		int absExponent = exponent;
		if(exponent < 0)
			absExponent = -exponent;
		result = power_method_1(base,absExponent);
		if (exponent < 0)
			result = 1.0 / result;
		return result;
	}
	public static boolean equal(double num1,double num2)
	{
		if(Math.abs(num1 - num2) < .0000001)
			return true;
		return false;
	}
	//������ 
	public static double power_method_3(double base,int exponent)
	{
		if(exponent == 0)
			return 1;
		if(exponent == 1)
			return base;
		double result = power_method_3(base, exponent >> 1);
		result *= result;
		if((exponent & 0x1) == 1)
			result *= base;
		return result;
	}
	public static void main(String[] args) {
		System.out.println("method one :"+power_method_1(.2, 3));
		System.out.println("method two :"+power_method_2(2, -3));
		System.out.println("method three :"+power_method_3(2, -3));
	}

}
