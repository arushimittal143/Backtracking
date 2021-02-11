class Solve
{
  	// The first argument is the string. You need to save all permutations in the ArrayList passed as 4th argument named perm add() method.
	// Dont print the permutations as they will be printed after needed processing (sorting in lexicographical order) at back end.
    static void permute(String str, int l, int r, ArrayList<String> perm) 
	{ 
		if (l == r) 
            perm.add(str); 
        else
        { 
            for (int i = l; i <= r; i++) 
            { 
                str = swap(str,l,i); 
                permute(str, l+1, r,perm); 
                str = swap(str,l,i); 
            } 
        } 
	}
    public static String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 
}
