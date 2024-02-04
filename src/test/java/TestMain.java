import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMain {

	@Test
	public void test() 
	{
		String[] args = {"2","4"};
		assertThrows(IndexOutOfBoundsException.class, ()-> {Main.main(args);});
		
	}

}
