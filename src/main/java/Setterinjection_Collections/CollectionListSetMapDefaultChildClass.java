package Setterinjection_Collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionListSetMapDefaultChildClass {
	private List<String> list1;
	private Set<Integer> set1;
	private Map<Integer,String> map1;
	public List<String> getList1() {
		return list1;
	}
	public void setList1(List<String> list1) {
		this.list1 = list1;
	}
	public Set<Integer> getSet1() {
		return set1;
	}
	public void setSet1(Set<Integer> set1) {
		this.set1 = set1;
	}
	public Map<Integer, String> getMap1() {
		return map1;
	}
	public void setMap1(Map<Integer, String> map1) {
		this.map1 = map1;
	}
	public void displayAllCollectValues() {
		System.out.println(list1);
		System.out.println(set1);
		System.out.println(map1);
	}

}
