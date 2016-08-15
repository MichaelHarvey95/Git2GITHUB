/**
 * 
 */
package ptpkg;

/**
 * @author l00102447
 *
 */
public class CucumberLet {

	//add items int the array
	public static int cucumber(int[] a) {
		int pear = 0;
		int i = 0;
		while(i < a.length)
		{
			pear = pear + a[i];
			i++;
		}
		return pear;//add numbers

	}
		//find item in array
	public static int lettuce(int[] a, int p)
	{
		int i =0;
		int berry = 0;
		while(i < a.length)
		{
			if(a[i] == p)
			{
				berry++;
			}
			i++;
		}
		return berry;//return location in array
	}
	
		//find out if p occurs in array
		//return first occurrence of item if found else -1
	public static int tomato (int[] a, int p)
	{
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] == p)
				return i;
		}
		return -1;
	}

}
