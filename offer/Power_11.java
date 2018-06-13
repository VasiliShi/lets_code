package lets.code.every.offer;
/**
 * 剑指offer 面试题11：数值的整数次方
 * 实现函数double Power(double base,int exponent)，求base的exponent次方
 * 不得使用库函数，同时不需要考虑大数问题
 * @author Administrator
 *
 */
public class Power_11 {
	//方法一
	public static double power_method_1(double base,int exponent)
	{
		double result = 1.0;
		for(int i = 1;i <= exponent; i++)
			result *= base;
		return result;
	}
	//方法二
	public static double power_method_2(double base,int exponent)
	{
		if(equal(base, 0.0) && exponent < 0) //处理指数为负数，底数为0
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
	//方法三 
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
