public class TestMethods {

        @Test
        public void Test1() {
            System.out.println("First Test");
        }
        @Test(priority = 2)
        public void Test2(){
            System.out.println("Second Test");
        }
        @Test(priority = 3)
        public void Test3(){
            System.out.println("Third Test");
        }
        @Test(priority = 4)
        public void Test4(){
            System.out.println("Third Test");
        }
        @Test(priority = 5)
        public void Test5(){
            System.out.println("Fifth Test");
        }
        @Test(priority = 6)
        public void Test6(){
            System.out.println("Sixth Test");
        }
        @Test(priority = 7)
        public void Test7(){
            System.out.println("Seventh Test");
        }
        @Test(priority = 8)
        public void Test8(){
            System.out.println("Eighth Test");
        }
        @Test(priority = 9)
        public void Test9(){
            System.out.println("Ninth Test");
        }
        @Test(priority = 10)
        public void Test10(){
            System.out.println("Tenth Test");
        }
        @AfterSuite
        public void EndTest(){
            System.out.println("Test is done");
        }
        @BeforeSuite
        public void StartTest(){
            System.out.println("Test started!");
        }

}
