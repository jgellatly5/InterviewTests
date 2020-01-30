package com.gallopdevs.interviewtests.datastructures.kotlin

class Node(val name: String, val next: Node? = null)

fun remove(node: Node, index: Int): Node {
    var i: Int = 0
    var previous: Node? = null
    var current: Node? = node
    while (current != null) {
        if (i == index) {
            previous = current.next
            return previous!!
        }
        previous = current
        current = current.next
        i++
    }
    return node
}

