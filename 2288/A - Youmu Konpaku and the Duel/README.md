<h2><a href="https://codeforces.com/contest/2288/problem/A" target="_blank" rel="noopener noreferrer">2288A — Youmu Konpaku and the Duel</a></h2>

| | |
|---|---|
| **Difficulty** | Unrated |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 2288A](https://codeforces.com/contest/2288/problem/A) |

## Topics
`brute force` `math`

---

## Problem Statement

<div class="header"><div class="title">A. Youmu Konpaku and the Duel</div><div class="time-limit"><div class="property-title">time limit per test</div>1 second</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div><div><p>Youmu Konpaku is dueling a youkai. The youkai has $$$x$$$ health, and Youmu's attack power is $$$1$$$.</p><p>In one move Youmu does one of the following:</p><ul> <li> Charge: gain one stack. Each stack increases her attack power by $$$1$$$. </li><li> Attack: deal damage equal to her current attack power to the youkai, then the number of stacks decreases by $$$1$$$ (if she has any). </li></ul><p>The youkai is defeated once its health becomes $$$0$$$ or less. Find the minimum number of moves Youmu needs.</p></div><div class="input-specification"><div class="section-title">Input</div><p>Each test contains multiple test cases. The first line contains the number of test cases $$$t$$$ ($$$1 \le t \le 100$$$). The description of the test cases follows.</p><p>Each of the next $$$t$$$ lines contains a single integer $$$x$$$ ($$$1\le x\le 10^4$$$) — the health of the youkai.</p></div><div class="output-specification"><div class="section-title">Output</div><p>For each test case, output a single integer — the minimum number of moves.</p></div><div class="sample-tests"><div class="section-title">Example</div><div class="sample-test"><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id006040253492909052" id="id008384233081300363" class="input-output-copier">Copy</div></div><pre data-content="6
1
2
3
4
10
10000
" id="id006040253492909052"><div class="test-example-line test-example-line-even test-example-line-0">6</div><div class="test-example-line test-example-line-odd test-example-line-1">1</div><div class="test-example-line test-example-line-even test-example-line-2">2</div><div class="test-example-line test-example-line-odd test-example-line-3">3</div><div class="test-example-line test-example-line-even test-example-line-4">4</div><div class="test-example-line test-example-line-odd test-example-line-5">10</div><div class="test-example-line test-example-line-even test-example-line-6">10000</div></pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id008616185054749335" id="id005581155020316154" class="input-output-copier">Copy</div></div><pre data-content="1
2
3
4
7
244
" id="id008616185054749335"><div class="test-example-line test-example-line-odd test-example-line-1">1</div><div class="test-example-line test-example-line-even test-example-line-2">2</div><div class="test-example-line test-example-line-odd test-example-line-3">3</div><div class="test-example-line test-example-line-even test-example-line-4">4</div><div class="test-example-line test-example-line-odd test-example-line-5">7</div><div class="test-example-line test-example-line-even test-example-line-6">244</div></pre></div></div></div><div class="note"><div class="section-title">Note</div><p>In the first test case, one attack is enough: it deals $$$1$$$ damage.</p><p>In the second test case, Youmu charges once (her attack power becomes $$$2$$$) and attacks once, so $$$2$$$ moves are enough. Note that attacking twice also takes $$$2$$$ moves.</p><p>In the fifth test case, Youmu charges $$$4$$$ times and attacks $$$3$$$ times: the attacks deal $$$5$$$, $$$4$$$, and $$$3$$$ damage, $$$12$$$ in total, so it takes $$$7$$$ moves. With $$$6$$$ moves she can deal at most $$$9$$$ damage, so the answer is $$$7$$$ .</p></div>