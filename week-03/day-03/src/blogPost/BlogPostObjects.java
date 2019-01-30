package blogPost;

public class BlogPostObjects {
    public static void main(String[] args) {
        BlogPost firstPost = new BlogPost();
        firstPost.authorName = "John Doe";
        firstPost.title = "Lorem Ipsum";
        firstPost.text = "Lorem ipsum dolor sit amet.";
        firstPost.publicationDate = "2000.05.04";

        BlogPost secondPost = new BlogPost();
        secondPost.authorName = "Tim Urban";
        secondPost.title = "Wait but why";
        secondPost.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
        secondPost.publicationDate = "2010.10.10";

        BlogPost thirdPost = new BlogPost();
        thirdPost.authorName = "William Turton";
        thirdPost.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
        thirdPost.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";
        thirdPost.publicationDate = "2017.03.28";


    }
}
