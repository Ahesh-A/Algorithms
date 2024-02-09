package algorithm;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import myds.heap.MinHeap;

public class Main {
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
//		Integer[] arr =  {16, 10, 4, 7, 9, 14, 2, 8, 3, 1};
//		MinHeap<Integer> minHeap = new MinHeap<Integer>(arr);
		
		Cat cat = new Cat();
		
		for(Method method: cat.getClass().getDeclaredMethods()) {
			
			if(method.isAnnotationPresent(ImportantMethod.class)) {
				Annotation annotation = method.getAnnotation(ImportantMethod.class);
				
				for(int i = 0; i < ((ImportantMethod) annotation).times(); i++) {
					method.invoke(cat);
				}
			}
		}
//		if(minHeap.getClass().isAnnotationPresent(VeryImportant.class)) {
//			System.out.println("This is very important");
//		} else {
//			System.out.println("This is not very important :(");
//		}
		
//		try {
//			minHeap.heapSort();
//			System.out.print(minHeap.getHeap());
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.print("Error");
//		}
	}
}
