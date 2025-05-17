/*
 Notes class that has a title of note and some content
 */
package projectmanagementformative;

/**
 *
 * @author annak
 */
public class Notes {
    private String topic;
    private String content;
    public Notes(){
        topic="";
        content="";
    }
    public Notes(String topic, String content){
        this();
        this.topic=topic;
        this.content=content;
    }
    
    public void setTopic(String topic){
        this.topic=topic;
    }
    public String getTopic(){
        return topic;
    }
    public void setContent(String content){
        this.content=content;
    }
    public String getContent(){
        return content;
    }
    
    public String toString() {
        return topic + ": \n" + content;
    }
}
