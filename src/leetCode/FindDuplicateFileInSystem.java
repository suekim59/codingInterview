package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateFileInSystem {
	//2021.05.19
	//Find Duplicate File in system
	class Solution {
	    public List<List<String>> findDuplicate(String[] paths) {
	    	
	    	//map ��� -> duplicate �� �� ã�ƾ� ��
	    	//�ݺ������� �ϳ��� �����ͼ� split���� �ڸ���
	    	//�迭�� �� ���� �Ź� ���
	    	Map<String,List<String>> map = new HashMap<>();
	    	for(String path : paths) {
	    		String [] arr = path.split(" ");
	    		String temp = arr[0]+'/';
	    		for(int i =1;i<arr.length;i++) {
	    			int index = arr[i].indexOf("(");
	    			String fileName = temp + arr[i].substring(0,index);
	    			String content = arr[i].substring(index+1, arr[i].length()-1);
	    			map.putIfAbsent(content, new ArrayList<>());
	    			map.get(content).add(fileName); //map.get�ϸ� �迭�� ������ ������ ������ add
	    		}
	    	}
	    	
	    	List<List<String>> res = new ArrayList<>();
	    	for ( String key : map.keySet()) {
	    		if(map.get(key).size()>1) {
	    			res.add(map.get(key));
	    		}
	    	}
			return res;
	    }
	}

}
