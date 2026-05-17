# 🔴 Visualization Exercise — Chapter 6: Exception Handling

## 🎬 Scene 1: The Safety Net in a Circus
You're a tightrope walker (the `try` block). Below you is a safety net (the `catch` block). Above you is the audience watching. If you slip (exception occurs), you DON'T fall to your death — you fall into the net (caught!), bounce back up, take a bow, and the show continues. **The `finally` block is the curtain call — it happens whether you slipped or not.** Without a safety net, one slip ends everything.

## 🎬 Scene 2: Custom Exception — The Specific Error Message
You're managing a bank. Instead of saying "something went wrong" when someone tries to overdraft, you say "InsufficientFundsException: Account has ₹500 but ₹1000 was requested." The custom exception is like a specific medical diagnosis vs. just saying "you're sick." It gives the caller (code or human) enough info to respond correctly.

## 🎬 Scene 3: Try-with-Resources — Auto-Closing a Safe
You open a bank vault (file/connection). You do your work inside. Now — what if the alarm goes off midway? Without try-with-resources, the vault might stay open (resource leak). With try-with-resources, the vault automatically locks when you leave, whether you left normally or were carried out in an emergency.

## ✍️ After Visualization
1. What happens if an exception is thrown but there's no matching catch?
2. When does `finally` NOT run?
3. Why should your custom exception message be detailed?
