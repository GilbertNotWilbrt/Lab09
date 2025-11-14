

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CommentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CommentTest
{
    /**
     * Default constructor for test class CommentTest
     */
    public CommentTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown(){
    }
    public void constructorStoresDetails(){
        Comment comment = new Comment("Alice", "Nice book", 4);
        assertEquals("Alice", comment.getAuthor());
        assertEquals("Nice phone", comment.getText()); //not sure why it's not working if its in fields
        assertEquals(4, comment.getRating());
    }
    
    public void upvoteIncreasesVoteCount()
    {
        Comment comment = new Comment("Bob", "Ok", 3);
        comment.upvote();
        assertEquals(1, comment.getVoteCount());
    }
}