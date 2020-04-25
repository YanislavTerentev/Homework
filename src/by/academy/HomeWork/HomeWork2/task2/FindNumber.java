package by.academy.HomeWork.HomeWork2.task2;

public class FindNumber {
    public void search(Integer[] mass){
        StringBuilder builder = new StringBuilder();
        int i;
        int j;
        int oddCounter = 0;

        builder.append(mass[0]).append(",");
        for (i = 1; i < mass.length; i++){
            if (!builder.toString().contains(mass[i].toString()+",")){
                builder.append(mass[i]).append(",");
            }
        }

        String[] strArr = String.valueOf(builder).split(",");
        int[] numArr = new int[strArr.length];
        for (i = 0; i < strArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
        }
        Integer[] counter = new Integer[numArr.length];
        for(i = 0; i < counter.length; i++){counter[i] = 0;}

        for (i = 0; i < mass.length; i++){
            for (j = 0; j < counter.length; j++){
                if (numArr[j] == mass[i]) counter[j] += 1;
            }
        }
        for (i = 0; i < counter.length; i++){
            if (counter[i]%2 == 1){
                oddCounter = i;
            }
        }
        System.out.println(numArr[oddCounter]);
    }
}
