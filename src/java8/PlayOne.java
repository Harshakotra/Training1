package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PlayOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating lists for play
		List<Employee> emplist = Arrays.asList(new Employee("SriHari", 25, 3000), new Employee("Bharath", 26, 300),
				new Employee("Vihari", 25, 299), new Employee("Vihari", 25, 299), new Employee("Raghava", 25, 5000),
				new Employee("Harsha", 25, 2999));

		// sorting based on name if both has same name then by vale
		emplist.sort(Comparator.comparing(Employee::getAge).thenComparing(Employee::getName));
		System.out.println(emplist);
		// removing duplicates
		List<Employee> dp = emplist.stream().distinct().collect(Collectors.toList());
		System.out.println(dp);
		Stream<String> streams = Stream.of("lal", "cal", "mal", "dal", "ral");

		// adding vales and removing lal and sorting and into immtable list.
		// var is sed as part of java15
		var ss = streams.dropWhile(x -> x.startsWith("l")).sorted().collect(Collectors.toUnmodifiableList());
		System.out.println(ss);

		String s1, s2, s3;
		s1 = "Harsha";
		s2 = "Bharath";
		s3 = "Harsha";
		String sx = new String("Harsha");

		System.out.println(s1.hashCode() + "next" + s3.hashCode() + "obj" + sx.hashCode());

	}

}
