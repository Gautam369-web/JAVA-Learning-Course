# 🔴 Visualization Exercise — Chapter 5: Collections

## 🎬 Scene 1: ArrayList — A Dynamic Shopping List
You're at a grocery store with a notepad (ArrayList). Unlike a fixed-size grocery receipt, you can ADD items anywhere, REMOVE items, and the list grows and shrinks dynamically. You number each item starting from 0. "eggs" is item #0, "milk" is item #1. If you remove "eggs", "milk" becomes item #0 automatically. **Feel the dynamic resizing — this is what makes ArrayList different from arrays.**

## 🎬 Scene 2: HashMap — Your Phone Book
Imagine your phone contacts. Each contact has a NAME (key) and a NUMBER (value). You look up "Priya" — instantly, the phone book jumps to Priya's number. You don't scan every entry. **O(1) lookup — this is HashMap's superpower.** Now imagine two people both named "Priya" — phone books handle this badly! HashMap too: the second `put("Priya", ...)` OVERWRITES the first.

## 🎬 Scene 3: HashSet — The VIP Guest List
You're a bouncer at an event with a VIP list. When a person arrives, you check if they're on the list. You also enforce: NO duplicates. If "Alice" tries to get added twice, you say "already here!" and ignore the second entry. **Uniqueness is guaranteed automatically.** The downside: you have no idea what ORDER people arrived in.

## ✍️ After Visualization
1. What collection would you use to count word frequency in a document?
2. What collection ensures no duplicate student IDs?
3. Why does ArrayList start from index 0?
