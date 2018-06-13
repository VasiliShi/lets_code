package lets.code.every.day;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MinimumIndexSumofTwoLists {

	public static String[] findRestaurant(String[] list1, String[] list2) {
        int min = Integer.MAX_VALUE;
        List<String>  result = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0; i < list1.length; i++)
            map.put(list1[i],i);
        for(int i = 0; i < list2.length; i++)
        {
//            Integer index = map.get(list2[i]);
            if(map.containsKey(list2[i]))
            {
            	int index = map.get(list2[i]);
            	if(i + index == min)
            	{
            		result.add(list2[i]);
            	}
            	else if(i + index < min)
            	{
            		result.clear();
            		result.add(list2[i]);
            	}
            }
//            if(index != null && i + index <= min)
//            {
//                if(i + index < min) 
//                {
//                    result.clear(); //存在更小的值，就将列表清空
//                    min = i + index;
//                }
//                result.add(list2[i]);
//            }
        }
        return result.toArray(new String[result.size()]); //这里将list转为数值
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String list1[] = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
		String list2[] = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
//		List list1 = Arrays.asList(a1);
//		List list2 = Arrays.asList(a2);
		
		String  result [] = findRestaurant(list1,list2);
		for(String str:result)
			System.out.println(str);

	}

}
