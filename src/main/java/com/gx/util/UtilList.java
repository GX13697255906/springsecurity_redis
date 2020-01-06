package com.gx.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UtilList {

    public static List<Double> mergeList(List<Double> list1,List<Double> list2){
        List<Double> result = new ArrayList<>();
        if(list1 == null){
            list1 = new ArrayList<>();
        }
        if(list2 == null){
            list2 = new ArrayList<>();
        }
        if(list1.size()>0 && list2.size()>0){
            for(int i = 0;i<96;i++) {
                double value = list1.get(i) + list2.get(i);
                result.add(value);
            }
        }else if(list1.size()>0 && list2.size()==0){
            return list1;
        }else if(list1.size()==0 && list2.size()>0){
            return list2;
        }
        return result;
    }

    /**
     * 发电侧-合并中长期分解信息
     * @param list
     * @param startStr
     * @param <T>
     * @return
     */
    public static <T> List<Double> mergeList(List<T> target,String startStr){
        List<Double> result = new ArrayList<>();
        List<List<String>> lists = new ArrayList<>();
        for(int i=0;i<target.size();i++){
            Map<String,Object> map = UtilMap.objectToMap(target.get(i));
            List<String> list = UtilString.convertTimeFormatValue(map,startStr);
            lists.add(list);
        }
        for(int i=0;i<96;i++){
            double sum = 0;
            for(int j=0;j<lists.size();j++){
                sum = sum+UtilString.stringToDouble(lists.get(j).get(i));
            }
            result.add(sum);
        }
        return result;
    }

}
