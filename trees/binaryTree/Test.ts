class CNode {
    data?: Object;
    children?: CNode[];
}
class Tree {
    root: CNode = new CNode();
   
     constructor(rootData: any) {
        this.root = new CNode();
        this.root.data = rootData;
        this.root.children = new Array();
    }
    
    public addSubtree(subtree: Tree): void {
        this.root.children?.push(subtree.root);
    }
}
 
const tree = new Tree("Ohh man");

const arr= [
    new Tree("a"),
    new Tree("b"),
    new Tree("c"),
    new Tree("d"),
    new Tree("e"),
    new Tree("f"),
    new Tree("g"),
    new Tree("h"),
];

for (const item of arr) {
    tree.addSubtree(item);
}
console.dir("tree");
console.dir(tree);
console.dir(tree.root);
// console.dir(tree);

// const b = new Tree("Janvier");
// const a = new Tree("Janvier");
// const a = new Tree("Janvier");
// const a = new Tree("Janvier");
// const a = new Tree("Janvier");
    

