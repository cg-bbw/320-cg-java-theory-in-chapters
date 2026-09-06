package ch.bbw.cge._02_documentation;


/**
 * This is a Javadoc comment. By pressing Alt+Enter we get the option "Add Javadoc".
 * Javadoc comments use slash and two asterisks to open and one asterisk and slash to close.
 * Javadoc follows some documentation rules by using annotations.
 * Most important Annotations are mentioned in this class:
 * @author Christian Gebert
 * @author IfThereIsAnotherOne JustRepeatThatAnnotation
 * @version 24.08.2026
 *
 * Btw. Some write JavaDoc some write Javadoc some write javadoc.
 * Javadoc allows HTML code to make special characters and URLs work.
 * More on Javadoc:
 * @see <a href="https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html">Oracle Javadoc</a>
 * A good example of a Library in Javadoc:
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html">Java Math Class</a>
 */
public class DocumentationTypes {

    String lineComment = ""; //This is a line comment. Line comments use double slash.
    /* This is a block comment. Block comments use slash and asterisk to open
    and vise versa to close. Block comments can be written over multiple lines.
    Block comments can be written even between code in one line.*/
    String blockComment = "";

    //optimize performance issue
    //FIXME This String should be fixed. Therefore, we use FIXME or TODO.
    // Any FIXME or TODO comment can be viewed in the TODO tool window on the left side.
    // We can add other tags that show up in the TODO tool window.
    // Go to Settings->Editor->TODO and insert a new tag with pattern \btagname\b.*
    String buggyComment = "DIeSEr KoMmenTar iSt feHLeRhaFt.";
    // TODO remove after testing.
    // Any TODO or FIXME comment can prevent the branch from being merged.
    // This can be made by GitHub Actions.
    String testComment = "Dieser Kommentar war nur zum Testen.";

    /**
     * This method has 2 parameters and one return type. The method concatenates
     * 2 new comments and stores them into blockComment.
     * @param comment1  This comment builds the first part of the blockComment
     * @param comment2  This comment builds the last part of the blockComment
     */
    public void explainJavadocParameter(String comment1, String comment2) {
        blockComment = comment1 + " " + comment2;
    }

    /**
     * This method has no parameter. It just concatenates the values of
     * blockComment and lineComment and returns its result.
     * @return blockComment + lineComment
     */
    public String explainJavadocReturn() {
        return blockComment+lineComment;
    }


    /**
     * This method is redundant.
     * See also {@link ch.bbw.cge._02_documentation.DocumentationTypes#explainJavadocReturn()}
     */
    public String explainJavadocSee() {
        return blockComment+lineComment;
    }


    /**
     * This method throws an exception {@code IllegalStateException}.
     * {@code @code} highlights the text included.
     *
     * @param state the state to evaluate; {@code 1} represents a valid state
     * @return  {@code "regular exit"} if {@code state == 1}
     *          {@code "application run aborted"} if {@code state == 0}
     * @throws IllegalStateException if {@code state != 1}
     */
    public String explainJavadocThrows(int state) throws IllegalStateException {
        if(state == 1) {
            return "regular exit";
        } else if(state == 0) {
            return "application run aborted";
        } else {
            throw new IllegalStateException("Ein nicht erlaubter Zustand wurde erreicht.");
        }
    }
}
