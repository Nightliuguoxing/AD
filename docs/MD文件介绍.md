# 环境介绍

## 可用语言

C/C++、Java、Python等均可。

## 编程工具

- VS Code
- DevC
- CodeBlocks
- Eclipse
- ……

## 评测平台

以CG平台为主：[CG](http://10.40.101.111/) 需校内IP或通过VPN访问。

# Markdown常用语法

作业/实验报告尽量使用**Markdown格式**，可以节省大量的排版时间。

> *We believe that writing is about content, about what you want to say – not about fancy formatting.*

我们坚信写作写的是内容，所思所想，而不是花样格式。

*— Ulysses for Mac*

可以参考[这里](https://markdown.com.cn/)学习Markdown的使用。

可以使用[在线编辑器](http://www.mdeditor.com/)辅助学习，也可以使用桌面程序[typora](https://typora.io/)。

![Pandao editor.md](https://pandao.github.io/editor.md/images/logos/editormd-logo-180x180.png "Pandao editor.md")

## 分级标题

## 分段换行

分段需要按两次enter。
只按一次是不会分段换行的。

## 字符效果和横线等

----

`*斜体字*`      *斜体字*

`**粗体**`  **粗体**

`***粗斜体***` ***粗斜体***

`~~删除线~~ `  ~~删除线~~ 

## 语言代码高亮

行内代码`#include <time.h>`。

代码块：

```C+
#include <stdio.h>

int main()
{
    long long sum = 0;
    for (int i = 0; i < 40000; ++i)
        for (int j = 0; j < 40000; ++j)
            ++sum;
    printf("sum = %lld\n", sum);
    
    return 0;
}
```

## 图片与链接

图片建议使用图床。

插入图片与插入链接类似：

链接：`[路过图床](www.imgchr.com)`会插入[路过图床](www.imgchr.com)的链接。

图片：`![]()`这样的格式，参考上面mdEditor的图片。

## 无序列表与有序列表

## 表格

功能较弱

| 左对齐  | 居中  | 右对齐 |
| :------------ |:-----:| -----:|
| 注意源文件上面的行 | 格式 | ----: |
| 一个英文`:`在最左边  | 两边都有`:` | 右边有一个`:` |
| 效果 | 效果  | 效果 |

## 数学公式

用一对`$`或者`$$`括起来，分别表示行内公式和行间公式。

上下标：`$x_1^2 + x_2 + x^3$`会显示为: $x_{10}^{20} + x_2 + x^3$

$$E=mc^2$$

公式书写比较方便：$(\sqrt{3x-1}+(1+x)^2)$

$$\sum_{i=1}^{n}i = \frac{n(n+1)}{2}$$

更多用法请自行搜索，可参考[这里](https://blog.csdn.net/weixin_43159148/article/details/88621318)。

# 实验题目

## 1. 时间复杂度与程序运行时间

参考计时代码：

C：
```C
#include <stdio.h>
#include <time.h>

int main()
{
    int n;
    scanf("%d", &n);

    clock_t st = clock();
    long long sum = 0;
    for (int i = 0; i < n; ++i)
        for (int j = 0; j < n; ++j)
            ++sum;
    clock_t ft = clock();
    double dt = (ft - st) * 1.0 / CLOCKS_PER_SEC;

    printf("sum = %lld\n", sum);
    printf("duration: %f s\n", dt);
    
    return 0;
}
```

C++
```C++
#include <iostream>
#include <chrono>

using namespace std;
using namespace std::chrono;
int main()
{
    int n;
    cin >> n;

    auto st = high_resolution_clock::now();
    long long sum = 0;
    for (int i = 0; i < n; ++i)
        for (int j = 0; j < n; ++j)
            ++sum;
    auto ft = high_resolution_clock::now();

    cout << "sum = " << sum << endl;
    cout << "duration: " << (ft - st).count() / 1e9 << " s" << endl;
    cout << "duration: " << duration_cast<seconds>(ft-st).count() << " s" << endl;
    cout << "duration: " << duration_cast<milliseconds>(ft-st).count() << " ms" << endl;

    return 0;
}
```

Python
```Python
import time
n = int(input())

st = time.perf_counter()
sum = 0
for i in range(n):
    for j in range(n):
        sum += 1
ft = time.perf_counter()

print(f"sum = {sum}")
print(f"duration: {ft - st} s")
```

此代码时间复杂度$O(n^2)$，在你的机器上，当$n$分别取1000、10000、20000、40000时的运行时间是多少？请写清运行代码的机器CPU配置。

请编写复杂度为$O(n\log n)$、$O(n)$的任意程序，在输入规模分别为1万、10万、100万、1000万、1亿、10亿时，记录运行时间。

## 2. 斐波那契数列计算

请用递归和递推实现斐波那契数列第n项的计算，结果对1000000007取模。

## 3. 最大子序和问题

请编写$O(n^3)$、$O(n^2)$、$O(n\log n)$的代码，自己生成一些测试数据进行本地测试，并分别在CG平台上提交。

随机生成测试数据使用的代码：
```Python
import random

n = int(input())
print(n)
LR = min(10000, n)
for _ in range(n):
    print(random.randint(-LR, LR), end=" ")
```
其他语言或者用Excel生成随机数据的方法请自行搜索、学习。