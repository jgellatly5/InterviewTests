package com.gallopdevs.interviewtests.questionsbytype;

import com.gallopdevs.interviewtests.questionsbytype.recursive.ChangeXY;
import com.gallopdevs.interviewtests.questionsbytype.recursive.Count8;
import com.gallopdevs.interviewtests.questionsbytype.recursive.CountHi;
import com.gallopdevs.interviewtests.questionsbytype.recursive.CountX;
import com.gallopdevs.interviewtests.questionsbytype.recursive.PowerN;
import com.gallopdevs.interviewtests.questionsbytype.trees.FindHeight;

import org.junit.Before;
import org.junit.Test;

public class Practice {

    private FindHeight.Node node;

    @Before
    public void Setup() {
        node = new FindHeight.Node(5);
        node.left = new FindHeight.Node(2);
        node.right = new FindHeight.Node(7);
        node.left.left = new FindHeight.Node(1);
        node.left.right = new FindHeight.Node(3);
        node.right.left = new FindHeight.Node(6);
        node.right.right = new FindHeight.Node(8);
    }

    @Test
    public void PracticeTest() {
        System.out.println("=========ChangeXY=========");
        System.out.println(ChangeXY.changeXY("xxhixx"));
        System.out.println(ChangeXY.changeXY("xhixhix"));
        System.out.println(ChangeXY.changeXY("hi"));
    }
}
