package test;
//8. List에 저장되어 있는 Members을 직업별로 그룹핑해서 MAP<String, List<Members>> 객체로 생성하려고함
// 키는 Members의 직업이고, 값은 해당직업을 갖는 Members들을 저장하고 있는 List임
// 실행결과를 보고 빈칸에 알맞은 코드를 입력:

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.*;
import java.util.stream.Collectors.*;
import java.util.Comparator.*;

class Member{
      private String name;
      private String job;
      public Member(String name, String job) {
         this.name = name;
         this.job = job;
      }
      public String getName() {
         return name;
      }

      public String getJob() {
         return job;
      }
      
      @Override
      public String toString() {
         return "{name:" + name + ", job:" + job +"}";
      }
   }

   public class Example2 {
   	public static void main(String[] args) {
        	List<Member> list = Arrays.asList(
   		new Member("홍길동","개발자"),
               	new Member("김나리","디자이너"),
               	new Member("신용권","개발자")
		);
         
         	Map<String, List<Member>> groupingMap = list.stream()
                	.collect(Collectors.groupingBy(Member::getJob, Collectors.toList()));
         			
         	System.out.println("[개발자]");
         	groupingMap.get("개발자").forEach(m-> System.out.println(m.toString()));
         	System.out.println();
         	System.out.println("[디자이너]");
         	groupingMap.get("디자이너").forEach(m-> System.out.println(m.toString()));
        }
}

/* (실행결과:)

[개발자]
{name:홍길동, job:개발자}
{name:신용권, job:개발자}

[디자이너]
{name:김나리, job:디자이너}

*/
