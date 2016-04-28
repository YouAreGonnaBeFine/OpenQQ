package com.mis.qq;

import com.mis.qq.callback.MessageCallback;
import com.mis.qq.client.OpenQQClient;
import com.mis.qq.model.*;

import java.util.List;

/**
 * @author ScienJus
 * @date 2015/12/18.
 */
public class Application {

    public static void main(String[] args) {
        //创建一个新对象时需要扫描二维码登录，并且传一个处理接收到消息的回调，如果你不需要接收消息，可以传null
        @SuppressWarnings("resource")
		OpenQQClient client = new OpenQQClient(new MessageCallback() {
            @Override
            public void onMessage(Message message) {
                System.out.println(message.getContent());
            }

            @Override
            public void onGroupMessage(GroupMessage message) {
                System.out.println(message.getContent());
            }

            @Override
            public void onDiscussMessage(DiscussMessage message) {
                System.out.println(message.getContent());
            }
        });
        //登录成功后便可以编写你自己的业务逻辑了
//        List<Category> categories = client.getFriendListWithCategory();
//        for (Category category : categories) {
//            System.out.println(category.getName());
//            for (Friend friend : category.getFriends()) {
//                System.out.println("————" + friend.getNickname());
//            }
//        }
        List<Group> groups = client.getGroupList();
      for (Group group : groups) {
    	  
    	  if(group.getName().equals("web测试")){
    		  System.out.println("找到群:web测试");
//    		  client.sendMessageToGroup(group.getId(),"测试测试测试");
    	  }
    	  if(group.getName().equals("逗比工会的的逗比群")){
    		  System.out.println("找到群:逗比工会的的逗比群");
//    		  client.sendMessageToGroup(group.getId(),"测试测试测试");
    	  }
    	  
//          System.out.println(group.getName()+"-------"+group.getId());
      }        
      
      
        //使用后调用close方法关闭，你也可以使用try-with-resource创建该对象并自动关闭
//        try {
//            client.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
