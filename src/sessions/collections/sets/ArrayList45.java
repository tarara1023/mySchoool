package sessions.collections.sets;

import java.util.*;

public class ArrayList45 {

    public static void main(String[] args) {

        List<String> clothes = new ArrayList<>(Arrays.asList("S", "M", "M","M","M","S", "L", "L", "S"));

        List<String> clothesMedium = new ArrayList<>();
        List<String> clothesLarge = new ArrayList<>();
        List<String> clothesSmall = new ArrayList<>();

//        Iterator<String> iterator = clothes.iterator();
//        while (iterator.hasNext()) {
//            if(iterator.next().equals())
//        }

        for (String size : clothes) {
            if (size.equals("M")){
                clothesMedium.add(size);
//                clothes.remove(size);
            }
            else if(size.equals("L")) {
                clothesLarge.add(size);
            }else
                clothesSmall.add(size);


        }


        System.out.println(clothesMedium);
        System.out.println(clothesLarge);
        System.out.println(clothesSmall);

        clothes.removeAll(clothesMedium);
        clothes.removeAll(clothesLarge);
        clothes.removeAll(clothesSmall);

        System.out.println(clothes);


    }

}
