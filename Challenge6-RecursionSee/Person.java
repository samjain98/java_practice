/**
 * @author sj2
 *
 */
public class Person
{
private final String name;
private final int age;
private final char gender;
private final Person child1; //left child
private final Person child2; //right child

public Person(String name, int age, char gender, Person c1, Person c2)
{
    this.name=name;
    this.age=age;
    this.gender=gender;
    this.child1 = c1;
    this.child2 = c2;
}

public String toString()
{
    return name+"*"+age+"*"+gender;
}

public String getName() 
{
	return name;
}

public int getAge() 
{
	return age;
}

public char getGender() 
{
	return gender;
}

public boolean equals(Person p)
{
	return (this.name.equals(p.name)) &&
			(this.age==p.age) &&
			(this.gender==p.gender);
}


public void print() 
{
   System.out.println(this);
   if(child1 != null)
       child1.print();
   if(child2 != null)
       child2.print();
   
}

public int count() // total person count including this object
{
	if ( (child1 == null && child2 != null) )
	{
		return 1 + child2.count();
	}
	else if (child2 == null && child1 != null)
	{
		return 1 + child1.count();
	}
	else if (child1 != null && child2 != null )
	{
		return 1 + child1.count() + child2.count();
	}
	else 
		return 1;
}
public int countGrandChildren() // but not greatGrandChildren
{
	//YOUR CODE HERE
	int total = 0;
	if (child1 != null)
	{
		if (child1.child1 != null)
			total++;
		if (child1.child2 != null)
			total++;
	}
	if (child2 != null)
	{
		if(child2.child1 != null)
			total++;
		if(child2.child2 != null)
			total++;
	}
	
	return total;
}

public int countMaxGenerations()
{
	if (child1 == null && child2 == null)
		return 1;
	
	if (child1 != null && child2 == null)
		return 1 + child1.countMaxGenerations();
	
	if (child2 != null && child1 == null)
		return 1 + child2.countMaxGenerations();
	
	if (child1 != null && child2 != null)
		
		if (child1.countMaxGenerations() > child2.countMaxGenerations())
			return 1 + child1.countMaxGenerations();
	
		else
			return 1 + child2.countMaxGenerations();
	
	return 1;
	
}

public int countGender(char gen)
{
	int match = 0;
	if (gen == gender)
		match  = 1;
	
	if ( (child1 == null && child2 != null) )
	{
		return match + child2.countGender(gen);
	}
	else if (child2 == null && child1 != null)
	{
		return match + child1.countGender(gen);
	}
	else if (child1 != null && child2 != null )
	{
		return match + child1.countGender(gen) + child2.countGender(gen);
	}
	else 
		return match;
}


public Person search(String name, int maxGeneration)
{
	return null;
}


} // end of class