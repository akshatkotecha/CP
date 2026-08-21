<h2><a href="https://codeforces.com/contest/2010/problem/A" target="_blank" rel="noopener noreferrer">2010A — Alternating Sum of Numbers</a></h2>

| | |
|---|---|
| **Difficulty** | 800 |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 2010A](https://codeforces.com/contest/2010/problem/A) |

## Topics
`brute force` `implementation` `math`

---

## Problem Statement

<div class="header"><div class="title">A. Alternating Sum of Numbers</div><div class="time-limit"><div class="property-title">time limit per test</div>2 seconds</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div><div><p>You are given a sequence of integers. Output the <span class="tex-font-style-it">alternating</span> sum of this sequence. In other words, output $$$a_1 - a_2 + a_3 - a_4 + a_5 - \dots$$$. That is, the signs of plus and minus alternate, starting with a plus.</p></div><div class="input-specification"><div class="section-title">Input</div><p>The first line of the test contains one integer $$$t$$$ ($$$1 \le t \le 1000$$$) — the number of test cases. Then follow $$$t$$$ test cases.</p><p>The first line of each test case contains one integer $$$n$$$ ($$$1 \le n \le 50$$$) — the length of the sequence. The second line of the test case contains $$$n$$$ integers $$$a_1, a_2, \dots, a_n$$$ ($$$1 \le a_i \le 100$$$).</p></div><div class="output-specification"><div class="section-title">Output</div><p>Output $$$t$$$ lines. For each test case, output the required alternating sum of the numbers.</p></div><div class="sample-tests"><div class="section-title">Example</div><div class="sample-test"><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id007655240616448022" id="id0008737279259500264" class="input-output-copier">Copy</div></div><pre id="id007655240616448022"><div class="test-example-line test-example-line-even test-example-line-0">4</div><div class="test-example-line test-example-line-odd test-example-line-1">4</div><div class="test-example-line test-example-line-odd test-example-line-1">1 2 3 17</div><div class="test-example-line test-example-line-even test-example-line-2">1</div><div class="test-example-line test-example-line-even test-example-line-2">100</div><div class="test-example-line test-example-line-odd test-example-line-3">2</div><div class="test-example-line test-example-line-odd test-example-line-3">100 100</div><div class="test-example-line test-example-line-even test-example-line-4">5</div><div class="test-example-line test-example-line-even test-example-line-4">3 1 4 1 5</div></pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id007145449525280667" id="id0048030433107129433" class="input-output-copier">Copy</div></div><pre id="id007145449525280667">-15
100
0
10
</pre></div></div></div>