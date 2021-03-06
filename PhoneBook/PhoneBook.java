/**
   TODO Write a one-sentence summary of your class here.
   TODO Follow it with additional details about its purpose, what abstraction
   it represents, and how to use it.

   @author  TODO Your Name
   @version TODO Date

   @author  Period - TODO Your Period
   @author  Assignment - Ch49B_PhoneBook

   @author  Sources - TODO list collaborators
 */
public class PhoneBook
{ 
    private PhoneEntry[] phoneBook;
    private int nextEntry;

    /**
     * Constructs a phonebook with a capacity of 25 entries and initializes
     * the first 10 entries.
     */
    public PhoneBook() // constructor
    {
        phoneBook = new PhoneEntry[25];

        phoneBook[0] = new PhoneEntry( "Jenny", "Java", "(555)555-5555" );
        phoneBook[1] = new PhoneEntry( "Bob", "Binary", "(101)010-1010" );
        phoneBook[2] = new PhoneEntry( "Olive", "Oyl", "(555)123-4567" );
        phoneBook[3] = new PhoneEntry( "Mycroft", "Holmes", "(555)123-4321" );
        phoneBook[4] = new PhoneEntry( "Lynne", "Brook", "(408)366-7700" );
        phoneBook[5] = new PhoneEntry( "Monty", "Vista", "(408)366-7600" );
        phoneBook[6] = new PhoneEntry( "Cooper", "Tino", "(408)366-7300" );
        phoneBook[7] = new PhoneEntry( "Bertha", "Binary", "(111)111-1111" );
        phoneBook[8] = new PhoneEntry( "Betty", "Binary", "(011)100-0000" );
        phoneBook[9] = new PhoneEntry( "Sara", "Toga", "(408)867-3411 " );

        nextEntry = 10;
    }

    /**
     * TODO Write your method description here.
     */
    public void print()
    {
        if ( nextEntry <= 0 )
        {
            System.out.println( "Phonebook empty!!" );
        }
        else
        {
            for ( int i = 0; i < nextEntry; i++ )
            {
                System.out.println(phoneBook[i].firstName + " " +
                    phoneBook[i].lastName + " " +
                    phoneBook[i].phoneNum);
            }
        }
    }

    /**
     * TODO Write your method description here.
     * 
     * @param pEntry
     * @return
     */
    public PhoneEntry add( PhoneEntry pEntry )
    {
        // TODO complete add method
    	if (nextEntry < 25) {
    		System.out.println(nextEntry);
    		phoneBook[nextEntry] = pEntry; 
    		nextEntry = nextEntry + 1;
    		return pEntry;
    	}
    	else {
    		System.out.println("add method not completed");
    		return null; } // phonebook is full
    }

    /**
     * TODO Write your method description here.
     * 
     * @param pEntry
     * @return
     */
    public PhoneEntry delete( PhoneEntry pEntry )
    {
        // TODO complete delete method
    	for (int x = 0; x < nextEntry; x++) {
    		if ((phoneBook[x].lastName.equalsIgnoreCase(pEntry.lastName))) {
    			if (phoneBook[x].firstName.equalsIgnoreCase(pEntry.firstName)) {
    				PhoneEntry returnthis = phoneBook[x];
    				phoneBook[x] = phoneBook[nextEntry - 1];
    				nextEntry = nextEntry - 1;
    				return returnthis;
    			}
    			
    		}
    	}
    	System.out.println("delete method not completed");
    	return null; 
    }

    /**
     * TODO Write your method description here.
     * 
     * @param pEntry
     * @return
     */
    public PhoneEntry[] search( PhoneEntry pEntry )
    {
        // TODO complete search method
    	PhoneEntry[] result = new PhoneEntry[10];
    	if (pEntry.lastName != null) {
    		if (pEntry.firstName.length() != 0) {
    			System.out.println("first name " + pEntry.firstName);
    			for (int x = 0; x < nextEntry; x++) {
    				if (phoneBook[x].lastName.equalsIgnoreCase(pEntry.lastName)) {
    					if (phoneBook[x].firstName.equalsIgnoreCase(pEntry.firstName)) {
    						result[0] = phoneBook[x];
    						return result;
    					}
    				}
    			}
    		}
    		else if (pEntry.firstName.length() == 0) {
    			int y = 0;
    			for (int x = 0; x < nextEntry; x++) {
    				if (phoneBook[x].lastName.equalsIgnoreCase(pEntry.lastName)) {
    					result[y] = phoneBook[x];
    					y = y + 1;
    			}
    		}
    	}
    	}
    	if (result.length != 0) {
    		return result;
    	}
    	else {
    		System.out.println("search method not completed");
    		return null;
    	}
    }
    
    //////////////////////////////////////////
    // Methods used for testing purposes only
    
    /**
     * For testing only
     * 
     * @return the PhoneEntry[] that represents this phoneBook
     */
    public PhoneEntry[] getPhoneBook()
    {
        return phoneBook;
    }
    
    /**
     * For testing only
     * @return the next entry field
     */
    public int getNextEntry()
    {
        return nextEntry;
    }
}