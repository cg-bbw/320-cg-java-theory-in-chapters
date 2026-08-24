package ch.bbw.cge._02_documentation;

/**
 * This is a Javadoc comment. By pressing Alt+Enter we get the option "Add Javadoc".
 * Javadoc comments use slash and two asterisks to open and one asterisk and slash to close.
 * Javadoc follows some documentation rules by using annotations.
 * Most important Annotations are mentioned in this class:
 * @author Christian Gebert
 * @author IfThereIsAnotherOne JustRepeatThatAnnotation
 * @version 1.0
 *
 * Btw. Some write JavaDoc some write Javadoc some write javadoc.
 * Javadoc allows HTML code to make special characters and URLs work.
 * More on Javadoc:
 * @see <a href="https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html">Oracle Javadoc</a>
 */
public class DocumentationTypes {

    String lineComment = ""; //This is a line comment. Line comments use double slash.
    /* This is a block comment. Block comments use slash and asterisk to open
    and vise versa to close. Block comments can be written over multiple lines.
    Block comments can be written even between code in one line.*/
    String blockComment = "";


    /**
     * This method has 2 parameters and one return type. The method concatenates
     * 2 new comments and stores them into blockComment.
     * @param comment1  This comment builds the first part of the blockComment
     * @param comment2  This comment builds the last part of the blockComment
     */
    private void explainJavadocParameter(String comment1, String comment2) {
        blockComment = comment1 + " " + comment2;
    }


    /**
     * This method has no parameter. It just concatenates the values of
     * blockComment and lineComment and returns its result.
     * @return blockComment + lineComment
     */
    private String explainJavadocReturn() {
        return blockComment+lineComment;
    }


    /**
     * This method is redundant.
     * See also {@link ch.bbw.cge._02_documentation.DocumentationTypes#explainJavadocReturn()}
     */
    private String explainJavadocSee() {
        return blockComment+lineComment;
    }

    /**
     * This method throws an exception {@code IllegalStateException}.
     * {@code @code} highlights the text included.
     *
     * @param state     is either 1 or not.
     * @return          regular exit when state = 1 or IllegalStateException
     * @throws IllegalStateException whenever the state is illegal.
     */
    private String explainJavadocThrows(int state) {
        if(state == 1) {
            return "regular exit";
        } else {
            throw new IllegalStateException("Ein nicht erlaubter Zustand wurde erreicht.");
        }
    }
}
