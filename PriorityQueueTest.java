/*
 Author: Mike O'Malley
 Source: PriorityQueueTest.java
Descrtn: Priority Queue of Tasks where LOW priority values = HIGH priority.

Ammendment History
Ver   Date        Author    Details
----- ----------- --------  ---------------------------------------------------
0.001 15-Oct-2019 Mike O    Created.

*/

import java.util.*;

class Task implements Comparable
{
   private int    priority;
   private String description;

   public Task()
   {
      priority = 0;
      description = "";
   }

   public Task (int priority, String description)
   {
      this.priority    = priority;
      this.description = description;
   }

   public int getPriority ()
   {
      return priority;
   }

   public String getDescription ()
   {
      return description;
   }

   public void setPriority (int priority)
   {
     this.priority    = priority;
   }

   public void setDescription (String description)
   {
      this.description = description;
   }

   @Override
   public int compareTo (Object obj)
   {
      int result = -1; // Not the same.

      if (obj == null)
      {
          result = -1; // Not the same.
      }

      else if (this == obj)
      {
         result = 0; // Memory addresses are the same, so we are comparing an object
                     // to itself.
      }

      else if (obj instanceof Task)
      {
         Task objTask = (Task) obj;

         if (getPriority() < objTask.getPriority())
            return -1;  // The prioroty for this < obj
         else if (getPriority() == objTask.getPriority())
            return 0;  // The prioroty for this == obj
         else
            return 1;  // The prioroty for this > obj
      }

      return result;
   }

   @Override
   public String toString()
   {
      return priority + "\t" + description;
   }
}

public class PriorityQueueTest
{
   public static void main (String[] args)
   {
      PriorityQueue<Task> tasks = new PriorityQueue<Task>();

      tasks.add (new Task (1, "Buy a Quadbike") );
      tasks.add (new Task (2, "Buy health insurance") );
      tasks.add (new Task (3, "Learn tricks on Quadbike") );
      tasks.add (new Task (9, "Jump Quadbike over cars") );

      for (Task task : tasks)
         System.out.println (task.toString() );

   }
}