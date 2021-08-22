## 资料
书名：《图解设计模式》 作者: 结城浩 译者: 杨文轩
## 用Java实现设计模式
### Day1
Iterator模式
* 定义：将循环变量i的作用抽象化，通用化后形成的设计模式
* 形式：为某个类创建迭代器，使其能使用迭代器遍历
* 作用：使遍历和具体实现分离，这样后面只修改实现迭代器的逻辑即可，对于遍历则不用修改
### Day2
Adapter模式：类适配器，委托适配器
* 定义：填补“现有的程序”和“所需的程序”之间差异的设计模式
* 形式：经过适配器，将被适配类转化成目标类，实际上目标类和被适配类的部分功能应该是相同的
* 作用：把类当作组件复用时；不改变现有代码使现有代码适配新的接口；更容易维护新旧版本

TemplateMethod模式
* 定义：在父类中定义处理流程的框架，在子类中实现具体处理的设计模式
* 形式：父类定义处理流程的方法，而且被final修饰，保证不被子类修改
* 作用：逻辑处理通用化

FactoryMethod模式
* 定义：将TemplateMethod模式用于生成实例，就成了工厂方法模式
* 形式：工厂方法生成产品实例，而不再通过new产品的方式
* 作用：框架与具体加工解耦，而且在工厂中可以做一些创建实例时就必须做的事，比如记录实例信息