package com.sparta.ss.start;

import com.sparta.ss.exceptions.SorterLoaderException;
import com.sparta.ss.sorters.*;

public class SortFactory {
    public static Sorted getNumber(int number) throws SorterLoaderException{
        switch(number){
            case 1:
                return new BinarySorter();
            case 2:
                return new BubbleSort();
            case 3:
                return new MergeSort();
            case 4:
                return new QuickSorter();
            default:
                throw new SorterLoaderException("Invalid Sorter choice: " + number);
        }
    }


}

