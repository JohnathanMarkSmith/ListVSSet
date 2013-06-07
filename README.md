###  This is a coding example of a List VS Set for Interview

## Set and List explanation

    Set – Stored elements in unordered or shuffles way, and does not allow duplicate values.
    List – Stored elements in ordered way, and allow duplicate values.

## Set and List Example


    public static void main( String[] args )
    {
    	System.out.println("List example .....");
    	List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("1");

        for (String temp : list){
        	System.out.println(temp);
        }

        System.out.println("Set example .....");
        Set<String> set = new HashSet<String>();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("1");
        set.add("2");
        set.add("5");

        for (String temp : set){
        	System.out.println(temp);
        }
    }


## Output

    List example .....
    1
    2
    3
    4
    1
    Set example .....
    3
    2
    10
    5
    4

In Set, the stored values are in unordered way, and the duplicated value will just ignored.

If you have any questions please email me at john@johnathanmarksmith.com