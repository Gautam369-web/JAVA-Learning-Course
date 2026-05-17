# 🔴 Visualization Exercise — Chapter 8: Generics & Functional

## 🎬 Scene 1: Generic Box — The Universal Container
Imagine a magical box that can hold ANYTHING but only ONE type of thing at a time. Before you put anything in, you label the box: "String Box" or "Integer Box." Once labeled, only that type fits. This is `Box<T>`. Without generics, you have a box that accepts everything but randomly gives you the wrong thing when you reach in — a runtime ClassCastException!

## 🎬 Scene 2: Stream — The Assembly Line
You're a factory manager. Raw materials (your List) come in on a conveyor belt. First station: a filter that rejects faulty parts. Second station: a machine that reshapes each part (map). Third station: a counter that tallies the output (reduce/count). The belt itself is the STREAM. Nothing moves until you start the engine (terminal operation). Before then, you've just set up the stations — nothing actually runs!

## 🎬 Scene 3: Lambda — The Anonymous Worker
Instead of hiring a named employee with a contract, you hire a temp worker and tell them exactly ONE thing to do: "Take this item, double it, give it back." That instruction IS the lambda: `(x) -> x * 2`. No name, no class, no contract. Just a single task. Small, powerful, disposable.

## ✍️ After Visualization
1. Why can't you add an Integer to a `Box<String>`?
2. What happens to a Stream after you call a terminal operation on it?
3. Rewrite this without a lambda: `list.sort((a, b) -> a.length() - b.length())`
