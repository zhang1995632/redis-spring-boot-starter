package com.cq.im.probuf;

public class ProbufTest {

    public static void main(String[] args) {
        User.UserLoad userLoad = User.UserLoad.newBuilder().setId(1).setName("111").build();
        System.out.println(userLoad.toString());
    }
}
